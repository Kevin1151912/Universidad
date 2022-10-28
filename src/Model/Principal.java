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
    
    public static void main(String[] args) {
        Vista vista= new Vista();
        DocenteDTO d= new DocenteDTO();
        MateriaDTO m= new MateriaDTO();
        Universidad u = new Universidad();
        Control control = new  Control(vista, d, m, u);
        vista.setVisible(true);
    }
    
}
