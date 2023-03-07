package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	private String parolaDaEliminare;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtAreaTempi;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	this.txtResult.clear();
    	
    	elenco.addParola(txtParola.getText());
    	String ss = elenco.getElenco().get(0);
    	
    	for(String s : elenco.getElenco()) {
    		if(s.compareTo(ss) != 0) { 
    			this.txtResult.appendText("\n");
    		}
    		
    		this.txtResult.appendText(s);
    	}
    	this.txtParola.clear();
    	this.txtAreaTempi.setText("Tempo di esecuzione: " + System.nanoTime());

    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	this.txtResult.clear();
    	this.txtAreaTempi.setText("Tempo di esecuzione: " + System.nanoTime());

    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	
    	parolaDaEliminare = this.txtResult.getSelectedText();
    	elenco.cancella(parolaDaEliminare);
    	this.txtResult.clear();
    	String ss = elenco.getElenco().get(0);
    	
    	for(String s : elenco.getElenco()) {
    		if(s.compareTo(ss) != 0) {
    			this.txtResult.appendText("\n");
    		}
    		this.txtResult.appendText(s);
    	}
    	this.txtAreaTempi.setText("Tempo di esecuzione: " + System.nanoTime());
    	

    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
