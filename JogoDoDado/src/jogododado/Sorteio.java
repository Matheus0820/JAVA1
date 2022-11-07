/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogododado;

/**
 *
 * @author Theus
 */
import java.util.Random;

public class Sorteio {
	private int dado1;
	private int dado2;
	
	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	Random s = new Random(); 
	
	public void sortear() {
		dado1 = (s.nextInt(6) + 1);
		dado2 = (s.nextInt(6) + 1); 
	
	}
	
	public int sorteado() {
		return  dado1 + dado2;
	}
}
