package com.nsdr.pica;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Péter Király <peter.kiraly at gwdg.de>
 */
public class Field {

    private String code;
    private List<Subfield> subfields;

    public Field(String code, List<String> subfieldCandidates) {
        this.code = code;
        subfields = new ArrayList<>();
        for (String subfieldCandidate : subfieldCandidates) {
            subfields.add(new Subfield(subfieldCandidate));
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Subfield> getSubfields() {
        return subfields;
    }

    public void setSubfields(List<Subfield> subfields) {
        this.subfields = subfields;
    }

    @Override
    public String toString() {
        return code + "\t" + StringUtils.join(subfields, " | ");
    }

}
