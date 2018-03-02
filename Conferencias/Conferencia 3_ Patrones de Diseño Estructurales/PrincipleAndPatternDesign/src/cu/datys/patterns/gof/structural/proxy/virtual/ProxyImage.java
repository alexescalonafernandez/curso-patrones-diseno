/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.proxy.virtual;

/**
 *
 * @author alexander.escalona
 */
public class ProxyImage implements Image{
    private final String path;
    private RealImage image;
    
    public ProxyImage(String path) {
        this.path = path;
    }

    public void draw() {
        if(image == null)
            image = new RealImage(path);
        System.out.println("delegating draw to real image");
        image.draw();
    }
    
    
}
