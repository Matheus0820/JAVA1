package visao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String leitura; 
		String Vleitura[][] = new String[6][5];
		int ParHori[] = new int[6];
		int Hori = 0; 
		int ParVert[] = new int[7];
		int Vert = 0;
		int guard[] = new int[7]; 
		int quant = 0, bitFTrns = 0, bitFRept = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Paridade impar ou par? 1 - impar / 2 - par");
		int escolha = ler.nextInt();
		
    	System.out.println("Digite os Bits: ");
    	ler.nextLine();
    	for(int i = 0; i < 6; i++) {
    		leitura = ler.nextLine();
    		Vleitura[i] = leitura.split("");
	    }
	    
    	//Leitura dos bits horizontais
	    quant = 0;
	    for(int i = 0; i < Vleitura.length; i++) {
	    	for(int j = 0; j < Vleitura[i].length; j++) {
	    	if(Integer.parseInt(Vleitura[i][j]) == 1) {
	    		quant++;
	    }
	    	}
	    	
	    	 // Definindo a paridade de toda linha de bits na horizontal
	    	 switch(escolha) {
	 	    case 1: 
	 	    	System.out.println(quant);
	 	    	if(quant % 2 == 1) {
	 	    		ParHori[i] = 0;
	 	    	} else {
	 	    	
	 	    		ParHori[i] = 1; 
	 	    	}
	 	    	break; 
	 	    case 2: 
	 	    	System.out.println(quant);
	 	    	if(quant % 2 == 0) {
	 	    		ParHori[i] = 0;
	 	    	} else {
	 	    		ParHori[i] = 1; 
	 	    	}
	 	    	break; 
	 	    }
	    	 
	    	 quant = 0;
	    	 
	    }
	    
	    	// Definindo a paridade da paridade dos bits da horizontal
	    quant = 0;
	    for(int i = 0; i < ParHori.length; i++) {
	    	
	    	if(ParHori[i] == 1) {
	    		quant++;
	    }
	    	}
	    
	    switch(escolha) {
 	    case 1: 
 	    	System.out.println(quant);
 	    	if(quant % 2 == 1) {
 	    		Hori = 0;
 	    	} else {
 	    	
 	    		Hori = 1; 
 	    	}
 	    	break; 
 	    case 2: 
 	    	System.out.println(quant);
 	    	if(quant % 2 == 0) {
 	    		Hori = 0;
 	    	} else {
 	    		Hori = 1; 
 	    	}
 	    	break; 
 	    }
	    
	    //Leitura dos Bits na Vertical
	    	for(int i = 0; i < 6; i++) {
	    		for(int j = 0; j < 5; j++) {
	    			guard[j] = Integer.parseInt(Vleitura[j][i]);
	    		}
	    		
	    		quant = 0;
	    	    for(int v = 0; i < guard.length; v++) {
	    	    	
	    	    	if(guard[v] == 1) { // Problema Aqui!!!
	    	    		quant++;
	    	    }
	    	    	}
	    	    // definindo a paridade de cada linha vertical lida
	    	    switch(escolha) {
	     	    case 1: 
	     	    	System.out.println(quant);
	     	    	if(quant % 2 == 1) {
	     	    		ParVert[i] = 0;
	     	    	} else {
	     	    	
	     	    		ParVert[i] = 1; 
	     	    	}
	     	    	break; 
	     	    case 2: 
	     	    	System.out.println(quant);
	     	    	if(quant % 2 == 0) {
	     	    		ParVert[i] = 0;
	     	    	} else {
	     	    		ParVert[i] = 1; 
	     	    	}
	     	    	break; 
	     	    }
	    	    
	    	    quant = 0;
	    	    
	    	}
	    
	    	// Definindo a paridade da paridade das verticais
	    	 quant = 0;
	 	    for(int i = 0; i < ParHori.length; i++) {
	 	    	
	 	    	if(ParVert[i] == 1) {
	 	    		quant++;
	 	    }
	 	    	}
	 	    
	 	   switch(escolha) {
	 	    case 1: 
	 	    	System.out.println(quant);
	 	    	if(quant % 2 == 1) {
	 	    		Vert = 0;
	 	    	} else {
	 	    	
	 	    		Vert = 1; 
	 	    	}
	 	    	break; 
	 	    case 2: 
	 	    	System.out.println(quant);
	 	    	if(quant % 2 == 0) {
	 	    		Vert = 0;
	 	    	} else {
	 	    		Vert = 1; 
	 	    	}
	 	    	break; 
	 	    }

	 	
	 	   if(Hori == Vert) {
	 		   System.out.println("Mensagem Recebida com Sucesso!!");
	 	   } else {
	 		  System.out.println("Mensagem Recebida com Erro!!");
	 	   }
    }
	
	
	    
	    

	}


