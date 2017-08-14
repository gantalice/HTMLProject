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
class Persona {
    String nombre;
    String edad;
    String ident;
    String telefono;


    
    public Persona(String nombre, String edad, String id, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.ident= ident;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdent() {
        return ident;
    }

    
    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + ident + ", telefono=" + telefono;
    }
    
}
