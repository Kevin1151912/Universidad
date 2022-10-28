/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Universidad {
    
    private ArrayList<DocenteDTO> pro;
    private ArrayList<MateriaDTO> ma;

    public Universidad() {
        pro = new ArrayList<>();
        ma = new ArrayList<>();
    }
    
    public void agregarDocente(DocenteDTO d, String codigo) {
        pro.add(d);
        System.out.println("Docente Guardado");
        for (int i = 0; i < pro.size(); i++) {
            if (pro.get(i).getCodigo().equals(codigo)) {
                d = pro.get(i);
            }
        }
        
    }
    
    public void agregarMateria(MateriaDTO m, String codigo) {
        ma.add(m);
        System.out.println("Materia Guardada");
        for (int i = 0; i < ma.size(); i++) {
            if (ma.get(i).getCodigo().equals(codigo)) {
                m = ma.get(i);
            }
        }
        
    }
    
    public DocenteDTO buscarDocente(String codigo) {
        DocenteDTO d = new DocenteDTO();
        for (int i = 0; i < pro.size(); i++) {
            if (pro.get(i).getCodigo().equals(codigo)) {
                d = pro.get(i);
            }
        }
        return d;
    }
    
    public MateriaDTO buscarMateria(String codigo) {
        MateriaDTO m = new MateriaDTO();
        for (int i = 0; i < ma.size(); i++) {
            if (ma.get(i).getCodigo().equals(codigo)) {
                m = ma.get(i);
            }
        }
        return m;
    }
    
}
