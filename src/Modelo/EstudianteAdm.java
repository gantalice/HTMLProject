/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author Ganta
 */
public class EstudianteAdm {

    LinkedList<Estudiante> listaEst;

    public EstudianteAdm() {
        listaEst = new LinkedList<>();
    }

    public void AgregarE(String codigo, String carrera, String semestre, String nombre, String edad, String id, String telefono) {
        listaEst.add(new Estudiante(codigo, carrera, semestre, nombre, edad, id, telefono));
    }

    public String Mostrar() {
        String msj = "<html><body><table border=1>";

        msj += "<tr><td>Nombre</td><td>ID</td><td>Telefono</td><td>Edad</td><td>Codigo</td><td>Carrera</td></tr>";

        for (Estudiante e : listaEst) {
            msj += "<tr>" + e.toString() + "</tr>";
        }

        msj += "</table></body></html>";

        return msj;
    }
}
