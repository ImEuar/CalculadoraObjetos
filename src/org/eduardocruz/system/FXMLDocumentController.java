/*
Nombre: Eduardo Alexander Cruz Sanchez
Código Técnico:  IN5AM
Carné: 2021122
Fecha de Creación: 23/03/2022
Fecha de Modificación: 30/03/2022
 */
package org.eduardocruz.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    double dato1, dato2, result = 0.0;
    int boton;
    double banco = 0.0;
    int contador = 0;
    int validacion = 0;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnMas;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMenos;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMulti;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnBackspace;
    @FXML private Button btnDiv;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnRaiz;
    @FXML private Button btnPotencia;
    @FXML private Button btnEntreCero;
    
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        // Números
        if(event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        else if(event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText() + "2");
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText() + "3");
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText() + "4");
        else if(event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText() + "5");
        else if(event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText() + "6");
        else if(event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText() + "7");
        else if(event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText() + "8");
        else if(event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        else if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        else if(event.getSource() == btnPunto){
            if(validacion == 0){
                if(txtPantalla.getText().length() == 0){
                    txtPantalla.setText(String.format("%.0f", result) + ".");
                } else if(txtPantalla.getText().equals("0.0")){
                    txtPantalla.setText("0.");
                }else{
                    txtPantalla.setText(txtPantalla.getText() + ".");
                }
                validacion = 1;
            }
        }
        
        // Operaciones
        // Suma
        else if(event.getSource() == btnMas){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            validacion = 0;
            if(result == 0){
                result = dato1;
                contador = 1;
            }
            else if(contador == 2){
                result = result - dato1;
                contador = 1;
            }
            else if(contador == 3){
                result = result * dato1;
                contador = 1;
            }
            else if(contador == 4){
                result = result / dato1;
                contador = 1;
            } else{
                result = result + dato1;
                contador = 0;
            }
            boton = 0;
        }
        // Resta
        else if(event.getSource() == btnMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            validacion = 0;
            if(result == 0){
                result = dato1;
                contador = 2;
            }
            else if(contador == 1){
                result = result + dato1;
                contador = 2;
            }
            else if(contador == 3){
                result = result * dato1;
                contador = 2;
            }
            else if(contador == 4){
                result = result / dato1;
                contador = 2;
            } else{
                result = result - dato1;
                contador = 0;
            }
            boton = 1;
        }
        // +/-
        else if(event.getSource() == btnMasMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            dato1 = dato1 * -1;
            txtPantalla.setText(String.valueOf(dato1));
        }
        // Multiplicación
        else if(event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            validacion = 0;
            if(result == 0){
                result = dato1;
                contador = 3;
            }
            else if(contador == 4){
                result = result / dato1;
                contador = 3;
            }
            else if(contador == 1){
                result = result + dato1;
                contador = 3;
            }
            else if(contador == 2){
                result = result - dato1;
                contador = 3;
            }else{
                result = result * dato1;
                contador = 0;
            }
            boton = 2;
        }
        // División
        else if(event.getSource() == btnDiv){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            validacion = 0;
            if(result == 0){
                result = dato1;
                contador = 4;
            }
            else if(contador == 3){
                result = result * dato1;
                contador = 4;
            }
            else if(contador == 1){
                result = result + dato1;
                contador = 4;
            }
            else if(contador == 2){
                result = result - dato1;
                contador = 4;
            }else{
                result = result / dato1;
                contador = 0;
            }
            boton = 3;
        }
        // CE
        else if(event.getSource() == btnCE){
            txtPantalla.clear();
            validacion = 0;
        }
        // C
        else if(event.getSource() == btnC){
            txtPantalla.clear();
            validacion = 0;
            dato1 = 0;
            dato2 = 0;
            result = 0;
        }
        // Backspace
        else if(event.getSource() == btnBackspace){
            int longitud = txtPantalla.getText().length();
            int caracter = txtPantalla.getText().length() - 1;
            String nuevoValor;
            if(longitud > 0){
                StringBuilder back = new StringBuilder(txtPantalla.getText());
                back.deleteCharAt(caracter);
                nuevoValor = back.toString();
                txtPantalla.setText(nuevoValor);
            }
        }
        // Porcentaje
        else if(event.getSource() == btnPorcentaje){
            dato1 = Double.parseDouble(txtPantalla.getText());
            dato1 = (result * dato1)/100;
            txtPantalla.setText(String.valueOf(dato1));
        }
        // Raíz
        else if(event.getSource() == btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            dato1 = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(dato1));
        }
        // Potencia
        else if(event.getSource() == btnPotencia){
            dato1 = Double.parseDouble(txtPantalla.getText());
            dato1 = dato1 * dato1;
            txtPantalla.setText(String.valueOf(dato1));
        }
        // 1 Entre X
        else if(event.getSource() == btnEntreCero){
            dato1 = Double.parseDouble(txtPantalla.getText());
            dato1 = 1/dato1;
            txtPantalla.setText(String.valueOf(dato1));
        }
        
        // Igual
        else if(event.getSource() == btnIgual){
            switch(boton){
                case 0: //Suma
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    result = result + dato2;
                    txtPantalla.clear();
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 1: //Resta
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    result = result - dato2;
                    txtPantalla.clear();
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 2: //Multiplicación
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    result = result * dato2;
                    txtPantalla.clear();
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 3: //División
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    result = result / dato2;
                    txtPantalla.clear();
                    txtPantalla.setText(String.valueOf(result));
                    break;
            }
            result = 0.0;
            validacion = 0;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
