/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lester Dominguez
 */
public class FormularioController implements Initializable {

    @FXML
    private Label tfnombre;
    @FXML
    private TextField tnombre;
    @FXML
    private Label tfapellido;
    @FXML
    private TextField tapellido;
    @FXML
    private Label tfedad;
    @FXML
    private ComboBox<?> cbanio;
    @FXML
    private Label tfgenero;
    @FXML
    private RadioButton rbM;
    @FXML
    private RadioButton rbF;
    @FXML
    private Label tfid;
    @FXML
    private ComboBox<?> cbdepto;
    @FXML
    private ComboBox<?> cbmunicipio;
    @FXML
    private TextField tcodigopostal;
    @FXML
    private TextField tcolonia;
    @FXML
    private TextField tbloque;
    @FXML
    private TextField tcasa;
     @FXML
    private TextField tdatos;
    @FXML
    private Button bguardar;
    @FXML
    private Button beliminar;
    @FXML
    private Button bactualizar;
    @FXML
    private Button bbuscar;
    @FXML
    private Button bmostrar;
    @FXML
    private Button bsiguiente1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accionguardar(ActionEvent event) {
    }

    @FXML
    private void accioneliminar(ActionEvent event) {
    }

    @FXML
    private void accionactualizar(ActionEvent event) {
    }

    @FXML
    private void accionbuscar(ActionEvent event) {
    }

    @FXML
    private void accionmostrar(ActionEvent event) {
        String nombre = tnombre.getText();
        String apellido = tapellido.getText();
        String anio = cbanio.getValue().toString();
        tdatos.setText("nombre : "+nombre+"apellido: "+"anio nacimiento: "+anio);
        
    }

    @FXML
    private void accionsiguiente(ActionEvent event) {
        
    }
    
    /**
     *
     * @param url
     * @param rb
     */
    public void initialize (URL url, ResourseBundle rb){
        tnombre.setText("---");
    }
    
}
