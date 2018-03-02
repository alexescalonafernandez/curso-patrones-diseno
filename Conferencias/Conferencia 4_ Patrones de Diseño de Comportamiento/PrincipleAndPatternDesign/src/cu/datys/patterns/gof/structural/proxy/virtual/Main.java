/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.proxy.virtual;

import java.net.URI;

/**
 *
 * @author alexander.escalona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProxyImage proxy = new ProxyImage("test.png");
        proxy.draw();
    }
    
}
