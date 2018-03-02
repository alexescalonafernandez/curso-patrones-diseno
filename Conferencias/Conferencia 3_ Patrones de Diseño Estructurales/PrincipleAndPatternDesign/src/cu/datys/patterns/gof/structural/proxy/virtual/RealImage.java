/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.proxy.virtual;

import java.io.File;

/**
 *
 * @author alexander.escalona
 */
public class RealImage implements Image{
    private File image;

    public RealImage(String path) {
        loadImage(path);
    }
    
    private void loadImage(String path){
        System.out.println(String.format("costly operation for load %s image", path)); 
    }

    public void draw() {
        System.out.println("drawing real image");
    }
    
}
