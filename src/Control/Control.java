/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Views.Vista;
import java.awt.event.ActionEvent;

/**
 *
 * @author kevin
 */
public class Control implements ActionListener{
    private Vista vista;
    private DocenteDTO d;
    private MateriaDTO m;
    private Universidad u;
    
    public Control(Vista vista, DocenteDTO d, MateriaDTO m, Universidad u) {
        this.vista=vista;
        this.d = d;
        this.m = m;
        this.u=u;
        ActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar Materia")){
        m.setCodigo(vista.txtCodigoM.getText());
        m.setNombre(vista.txtNombreM.getText());
        m.setCreditos(vista.txtCreditos.getText());
        m.setCodProfesor(vista.txtCodProfesor.getText());
        MateriaDTO ma = new MateriaDTO( m.getCodigo(), m.getNombre(), m.getCreditos(), m.getCodProfesor());
        u.agregarMateria(ma, m.getCodigo());
        
        vista.txtCodigoM.setText("");
        vista.txtNombreM.setText("");
        vista.txtCreditos.setText("");
        vista.txtCodProfesor.setText("");
        }
        if(e.getActionCommand().equals("Buscar Materia")){
            MateriaDTO ma = u.buscarMateria(vista.txtCodigoM.getText());
            vista.txtCodigoM.setText(ma.getCodigo());
            vista.txtNombreM.setText(ma.getNombre());
            vista.txtCreditos.setText(ma.getCreditos());
            vista.txtCodProfesor.setText(ma.getCodProfesor());
            
        }
        if(e.getActionCommand().equals("Registrar Docente")){
        }
        if(e.getActionCommand().equals("Guardar Docente")){
        d.setCodigo(vista.txtCodigo.getText());
        d.setNombre(vista.txtNombre.getText());
        d.setApellido(vista.txtApellido.getText());
        d.setDireccion(vista.txtDireccion.getText());
        DocenteDTO doc = new DocenteDTO( d.getCodigo(), d.getNombre(), d.getApellido(), d.getDireccion());
        u.agregarDocente(doc, d.getCodigo());
        
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtApellido.setText("");
        vista.txtDireccion.setText("");
        }
        if(e.getActionCommand().equals("Buscar Docente")){
            DocenteDTO doc = u.buscarDocente(vista.txtCodigo.getText());
            vista.txtCodigo.setText(doc.getCodigo());
            vista.txtNombre.setText(doc.getNombre());
            vista.txtApellido.setText(doc.getApellido());
            vista.txtDireccion.setText(doc.getDireccion());
            
        }
        if(e.getActionCommand().equals("Registrar Materia")){
        }
        
    }
      

    private void ActionListener(Control control) {
        vista.jbGuardarM.addActionListener(control);
        vista.jbBuscarM.addActionListener(control);
        vista.jbRegistrarDocente.addActionListener(control);
        
        vista.jbGuardar.addActionListener(control);
        vista.jbBuscar.addActionListener(control);
        vista.jbRegistrarMateria.addActionListener(control);
        
    }
}
