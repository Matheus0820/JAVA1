package paridade;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String leitura; 
		String dpleitura[] = new String[7];
		int quant = 0;
		
		Scanner ler = new Scanner(System.in);
		
		//do {
    	System.out.println("Digite sua sequência de 7 bits ond cada bit deve ser espaçado por um espaço");
		leitura = ler.nextLine(); 
		
		
	    dpleitura = leitura.split(" ");
	    
	    quant = 0;
	    for(int i = 0; i < dpleitura.length; i++) {
	    	if(Integer.parseInt(dpleitura[i]) == 1) {
	    		quant++;
	    }
	    }
	    	
	    System.out.println("Digite 1 para paridade impar e 2 para par");
	    switch(ler.nextInt()) {
	    case 1: 
	    	System.out.println(quant);
	    	if(quant % 2 == 1) {
	    		System.out.println("0");
	    	} else {
	    		System.out.println("1");
	    	}
	    	break; 
	    case 2: 
	    	System.out.println(quant);
	    	if(quant % 2 == 0) {
	    		System.out.println("0");
	    	} else {
	    		System.out.println("1");
	    	}
	    	break; 
	    }
	    //System.out.println("Digite 1 para continuar e 2 para não continuar");
	    //}while(ler.nextInt() == 1);
	    
	    	
	    }

	}


