/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.flyweight.font;

/**
 *
 * @author alexander.escalona
 */
public class FontAwesomeIcon {
    private final String code;
    private final byte[] data;

    public FontAwesomeIcon(String code, byte[] data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public byte[] getData() {
        return data;
    }
    
}
