/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Estudiante;
import Modelo.EstudianteAdm;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author Ganta
 */
public class FXMLDocumentController implements Initializable {

    EstudianteAdm EstAdm;
    LinkedList<Estudiante> listaEst;

    @FXML
    private Label nom;

    @FXML
    private Label ed;

    @FXML
    private Label id;

    @FXML
    private Label tel;

    @FXML
    private Label cod;

    @FXML
    private Label carr;

    @FXML
    private Label sem;

    @FXML
    private TextField Textnom;
    @FXML
    private TextField Texted;
    @FXML
    private TextField Textid;
    @FXML
    private TextField Texttel;
    @FXML
    private TextField Textcod;
    @FXML
    private TextField Textcarr;
    @FXML
    private TextField Textsem;

    @FXML
    private MenuBar menu;

    @FXML

    private Menu opcion;

    @FXML

    private MenuItem ingresar;

    @FXML

    private MenuItem muestra;

    @FXML
    WebView tabla;

    WebEngine engine;

    String mostrar;

    @FXML
    private void ActionIngresar(ActionEvent event) {
        EstAdm.AgregarE(
                Textnom.getText(),
                Texted.getText(),
                Textid.getText(),
                Texttel.getText(),
                Textcod.getText(),
                Textcarr.getText(),
                Textsem.getText());
        System.out.println("Saved!");
        
        

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        listaEst = new LinkedList<>();
//        mostrar = "<table border =1>"
//                + "<tr><td>Nombre Estudiantes<td>"
//                + "<tr><td>Identificacion<td>"
//                + "<tr><td>Edad<td>"
//                + "<tr><td>Telefono<td>"
//                + "<tr><td>Codigo<td>"
//                + "<tr><td>Carrera<td>"
//                + "<tr><td>Semestre<td></tr>";
//        engine = tabla.getEngine();
        EstAdm = new EstudianteAdm();
        engine = tabla.getEngine();

    }

    @FXML
    private void ActionMostrar(ActionEvent event) {
        engine.loadContent(EstAdm.Mostrar());
//        for (int i = 0; i < listaEst.size(); i++) {
//
//            mostrar += "<tr>";
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getNombre();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getEdad();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getIdent();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getTelefono();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getCodigo();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getCarrera();
//            mostrar += "<td>";
//            mostrar += listaEst.get(i).getSemestre();
//            mostrar += "</tr>";
//        }
//        mostrar += "</table>";
//        engine.loadContent(mostrar);

    }

}
