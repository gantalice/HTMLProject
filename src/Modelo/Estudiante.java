package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganta
 */
public class Estudiante extends Persona {

    private String codigo;
    private String carrera;
    private String semestre;
    
    

    public Estudiante( String codigo, String carrera, String semestre, String nombre,String edad, String id, String telefono) {
        super(nombre, edad, id, telefono);
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "<td> " + super.getNombre() + "</td>"
                + "<td>" + super.getIdent() + "</td>"
                + "<td>" + super.getTelefono() + "</td>"
                + "<td>" + super.getEdad() + "</td>"
                + "<td>" + getCodigo() + "</td>"
                + "<td>" + getCarrera() + "</td>";
    }

    

}
