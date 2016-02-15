package com.nsdr.pica;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Péter Király <peter.kiraly at gwdg.de>
 */
public class Record {

    private List<Field> fields;

    public Record() {
        fields = new ArrayList<>();
    }

    public void addField(Field field) {
        fields.add(field);
    }

    @JsonIgnore
    public boolean isEmpty() {
        return fields.isEmpty();
    }

    @Override
    public String toString() {
        return StringUtils.join(fields, "\n");
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

}
