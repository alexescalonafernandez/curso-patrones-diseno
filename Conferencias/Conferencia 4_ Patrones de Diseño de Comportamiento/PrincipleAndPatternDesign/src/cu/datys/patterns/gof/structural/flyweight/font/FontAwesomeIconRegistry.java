/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.flyweight.font;

import java.util.HashMap;

/**
 *
 * @author alexander.escalona
 */
public class FontAwesomeIconRegistry {
    private final HashMap<String, FontAwesomeIcon> icons;

    public FontAwesomeIconRegistry() {
        this.icons = new HashMap<String, FontAwesomeIcon>();
    }
    
    public FontAwesomeIcon lookup(String code){
        FontAwesomeIcon icon = icons.get(code);
        if(icon == null){
            icon = new FontAwesomeIcon(code, loadIcon(code));
            icons.put(code, icon);
            System.out.println(String.format("Creating icon '%s'", code));
        }
        else System.out.println(String.format("Getting icon '%s' from cache", code));
        return icon;
    }
    
    private byte[] loadIcon(String code){
        byte[] data = new byte[16];
        //do something
        return data;
    }
    
}
