package com.nsdr.pica;

/**
 *
 * @author Péter Király <peter.kiraly at gwdg.de>
 */
class Subfield {

    String indicator;
    String value;

    public Subfield(String content) {
        this.indicator = content.substring(0, 1);
        this.value = content.substring(1);
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return '{' + indicator + ": " + value + '}';
    }
}
