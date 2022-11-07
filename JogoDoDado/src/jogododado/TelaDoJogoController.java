/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogododado;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Theus
 */
public class TelaDoJogoController implements Initializable {
    
    ArrayList<Apostadores> Apostadores = new ArrayList<Apostadores>();
    Apostadores ap1 = new Apostadores();
    Sorteio s1 = new Sorteio();
    
    @FXML
    TextField TextFildNomejogador = new TextField();
    @FXML 
    TextField TextFildNumeroAposta = new TextField();
    @FXML
    TextField TextFildVelorAposta = new TextField();
    @FXML
    Button ButtonCadastrarJogador = new Button();
    @FXML
    Label LabelJogadore = new Label();
    @FXML
    Label LabelHistorico = new Label();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    String Dados = "";
    int fleg = 0;
    public void NovoJogador() {
        if(fleg <= 12) {
       String nome = TextFildNomejogador.getText();
       int numApost = Integer.parseInt(TextFildNumeroAposta.getText());
       int valorApost = Integer.parseInt(TextFildVelorAposta.getText());
       
       ap1.setNomeApostador(nome);
       ap1.setNumApostado(numApost);
       ap1.setValorApostado(valorApost);
       Apostadores.add(ap1);
       
       Dados =  Dados + "\n" + " - " + nome + " - " + numApost + " - " + valorApost;
       
       LabelJogadore.setText(Dados);
        }
        else {
            JOptionPane.showMessageDialog(null, "Total de Jogadores Exedido!! \n 12 Jogadores já Cadastrados. \n Comece o Jogo!", "Alerta!", JOptionPane.INFORMATION_MESSAGE);
        }
        fleg++;
    }
    
    public void ComecaJogo() {
        //Chama a função para sortear os dados e mostra o resultado na tela
        
        s1.sortear();
	int ganhador = 30;
        for(int i = 0; i < Apostadores.size(); i++) {		
            if(Apostadores.get(i).getNumApostado() == (s1.sorteado())) {
		ganhador = i;
		}
	}
        
        if(ganhador != 30) {
        JOptionPane.showMessageDialog(null, "Ganhador \n - " + Apostadores.get(ganhador).getNomeApostador() + " - ", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não Houve nennhum Jogador", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        LabelHistorico.setText(Dados);
        Dados = "";
        LabelJogadore.setText(" - ");
        
    }
    
}
