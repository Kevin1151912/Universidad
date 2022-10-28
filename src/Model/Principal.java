/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Control;
import Views.Vista;

/**
 *
 * @author kevin
 */
public class Principal {
    
    /* Hola */
    
    public static void main(String[] args) {
        Vista vista= new Vista();
        Control control = new  Control(vista);
        vista.setVisible(true);
    }
    
}
