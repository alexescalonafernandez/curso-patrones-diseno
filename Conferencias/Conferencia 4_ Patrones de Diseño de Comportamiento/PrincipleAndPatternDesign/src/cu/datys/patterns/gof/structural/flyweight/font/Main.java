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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FontAwesomeIconRegistry icons = new FontAwesomeIconRegistry();
        System.out.println(icons.lookup("a"));
        System.out.println(icons.lookup("b"));
        System.out.println(icons.lookup("a"));
    }
    
}
