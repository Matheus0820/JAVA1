package visao;
// Jogo de dados

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.util.ArrayList;

import dominio.Sorteio;
import dominio.Apostadores;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		
		int QuaApost;
		int PremioTotal = 0;
		
		Sorteio s1 = new Sorteio();
		
		
		ArrayList<Apostadores> ListadeAp = new ArrayList<Apostadores>();
		
		
		// Área de coleta de dados com interface 1.0
		
		QuaApost = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Apostadores?"));
		
		// Processamento de dados 1.0 
		
		if(QuaApost > 11 || QuaApost < 1) {
			JOptionPane.showMessageDialog(null, "Quantidade de Apostadores Invalida!!!", "Alerta!", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			//int numApostados[] = new int[QuaApost]; // trocar por ArrayList do tipo Integer;
			ArrayList<Integer> numApostados = new ArrayList<Integer>();
			
			numApostados.add(30);
			System.out.println(numApostados.get(0));
			do {
				
				Apostadores ap = new Apostadores();
				ap.setNomeApostador(JOptionPane.showInputDialog("Nome do Jogador " + (ListadeAp.size() + 1)));
				
				int aux;
				
				// -- colocar dentro de um "do{}while();", onde, se der algum erro, o jogador possa escolher outro número.
				
				boolean parada = false;
				
				do {
				aux = Integer.parseInt(JOptionPane.showInputDialog("Número de aposta do Jogador " + (ListadeAp.size() + 1))); 
				
				if(aux < 2 || aux > 12) {
					JOptionPane.showMessageDialog(null, "Escolha um número de 2 a 12 para apostar!!! Nem inferior, nem superior a isso", "Alerta!", JOptionPane.INFORMATION_MESSAGE);
					System.out.println(aux);
				}
				else {
					int i;
					boolean igual = false;
					int numaux;
					
					for(i = 0; i < numApostados.size(); i++) {
						numaux =  numApostados.get(i);
						if(numaux == aux) {
						igual = true;
						}
					}
					
					if(igual) {
						
						JOptionPane.showMessageDialog(null, "Número apostado já escolhido por outro jogador!!!", "Alerta!", JOptionPane.INFORMATION_MESSAGE);
						
						
					}
					else {
						numApostados.add(aux);
						ap.setNumApostado(aux);
						
						parada = true;
					}
				
				}
				}while(!parada);
				
				ap.setValorApostado(Integer.parseInt(JOptionPane.showInputDialog("Valor apostado pelo Jogador " + (ListadeAp.size() + 1))));
				PremioTotal += ap.getValorApostado();
				
				ListadeAp.add(ap);
				
			} while((ListadeAp.size()) != QuaApost);
			
			
			
		}
		
		//Sortear número: -> 
		
		JOptionPane.showMessageDialog(null, "Começar jogo");
		
		s1.sortear();
		int ganhador = 30;
		for(int i = 0; i < ListadeAp.size(); i++) {
			
			
			if(ListadeAp.get(i).getNumApostado() == (s1.sorteado())) {
				ganhador = i;
				System.out.println(ganhador);
			}
		}
		
		
		JFrame jn = new JFrame();
		JLabel lab;
		if(ganhador != 30) {
		lab = new JLabel("<html> Números sorteados: " + s1.getDado1() + " - " + s1.getDado2() + "<br> Ganhador: " + ListadeAp.get(ganhador).getNomeApostador() + " -- Número apostado: " + ListadeAp.get(ganhador).getNumApostado() + "<br> Valor Apostado: " + ListadeAp.get(ganhador).getValorApostado() + " Reais <br> Valor ganho: " + PremioTotal + "Reais </html>", SwingConstants.CENTER);
		jn.add(lab); 
		}
		else {
			lab = new JLabel("<html> Não ouve nenhum ganhador!!" + "<br> Números sorteados: " + s1.getDado1() + " - " + s1.getDado2() + "<br> Valor total apostado: " + PremioTotal + " Reais </html>", SwingConstants.CENTER);
			jn.add(lab); 
		}
		
		jn.setTitle("Ganhador!");
		jn.setLocationRelativeTo(null);
		//jn.setResizable(false);
		jn.setVisible(true);
		jn.setSize(300,300);
		jn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		
	}

}
 // Criado por: MATHEUS RAMOS - IF21 