package com.nsdr.pica;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Péter Király <peter.kiraly at gwdg.de>
 */
public class Resolver {
    private static Map<String, Entry> map = new HashMap<>();
    
    static {
        map.put("001@", new Entry("001@", "value", "Besitzende Bibliotlıeken", "$0", "ILN", "$a", "Supplier Byte"));
        map.put("001A", new Entry("001A", "value", "Identifier and creation date", "0", "creation date"));
        map.put("001B", new Entry("001A", "value", "Identifier and creation date", "0", "creation date"));
    }
}
