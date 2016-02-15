package com.nsdr.pica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Péter Király <peter.kiraly at gwdg.de>
 */
public class Entry {

    String code;
    List<SubEntry> subentries;

    public Entry(String code) {
        this.code = code;
        subentries = new ArrayList<>();
    }

    public Entry(String code, String... candidates) {
        this.code = code;
        subentries = new ArrayList<>();
        for (int i = 0; i < candidates.length; i += 2) {
            subentries.add(new SubEntry(candidates[i], candidates[i + 1]));
        }
    }

    public void addSubEntry(SubEntry subentry) {
        subentries.add(subentry);
    }

    public class SubEntry {

        String code;
        String meaning;

        public SubEntry(String code, String meaning) {
            this.code = code;
            this.meaning = meaning;
        }
    }
}
