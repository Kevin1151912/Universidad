/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class MateriaDTO {
    
    private String codigo;
    private String nombre;
    private String creditos;
    private String codProfesor;

    public MateriaDTO(String codigo, String nombre, String creditos, String codProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.codProfesor = codProfesor;
    }

    public MateriaDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    @Override
    public String toString() {
        return "MateriaDTO{" + "codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", codProfesor=" + codProfesor + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        MateriaDTO m = (MateriaDTO) obj;
        
        if(this.getCodigo().equals(m.getCodigo()) && this.nombre.equals(m.getNombre()) && this.getCreditos().equals(m.getCreditos()) && this.codProfesor.equals(m.getCodProfesor())){
            return true;
        }
        return false;
    }
    
}
