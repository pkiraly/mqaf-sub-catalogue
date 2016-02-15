package com.nsdr.pica;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger log = Logger.getLogger(App.class.getCanonicalName());
    private static final Pattern p = Pattern.compile("^\\x1e([^ ]+) \\x1f(.*?)$");
    private static final ObjectMapper mapper = new ObjectMapper(new JsonFactory());

    public static void main(String[] args) {
        System.out.println("Hello World!" + args[0]);
        String file = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            Record record = new Record();
            while ((line = br.readLine()) != null) {
                // process the line.
                // System.err.println(String.format("line: %s (%d)", line, line.length()));
                Matcher m = p.matcher(line);
                if (m.find()) {
                    String code = m.group(1);
                    String values = m.group(2);
                    List<String> fields = Arrays.asList(values.split("\\x1f"));
                    record.addField(new Field(code, fields));
                } else {
                    if (!record.isEmpty()) {
                      printRecord(record);
                      record = new Record();
                    }
                }
            }
            printRecord(record);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void printRecord(Record record) {
        try {
            System.out.println("==========[ RECORD ]==============");
            String jsonInString = mapper.writeValueAsString(record);
            System.out.println(jsonInString);
        } catch (JsonProcessingException ex) {
            log.severe(ex.getLocalizedMessage());
        }
    }
}
