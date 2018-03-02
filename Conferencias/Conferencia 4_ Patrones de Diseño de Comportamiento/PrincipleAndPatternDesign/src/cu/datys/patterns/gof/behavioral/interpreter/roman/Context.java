package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Context {
    private String roman;
    private int value;

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
