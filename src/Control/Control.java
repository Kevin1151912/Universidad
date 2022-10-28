/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Views.Vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author kevin
 */
public class Control implements ActionListener{
    private Vista vista;
    
    public Control(Vista vista) {
        this.vista=vista;
        ActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    }
      

    private void ActionListener(Control control) {
    }
}
