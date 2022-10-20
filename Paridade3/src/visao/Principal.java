/*
00101
10110
00111
10001
01001
11011
00011
*/

package visao;

import java.util.Scanner;

public class Principal { 

	public static void main(String[] args) {
		
		String leitura; 
		String Vleitura[][] = new String[7][5];
		int ParHori[] = new int[5];
		int Hori = 0; 
		int ParVert[] = new int[8];
		int Vert = 0;
		int guard[] = new int[8]; 
		int quant = 0, bitFTrns = 0, bitFRept = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Paridade impar ou par? 1 - impar / 2 - par");
		int escolha = ler.nextInt();
		
    	System.out.println("Digite os Bits: ");
    	ler.nextLine();
    	for(int i = 0; i < 7; i++) {
    		leitura = ler.nextLine();
    		Vleitura[i] = leitura.split("");
	    }
    	int x = 0;
    	//Leitura dos bits horizontais
	    quant = 0;
	    for(int i = 0; i < Vleitura.length; i++) {
	    	System.out.println(Vleitura.length);
	    	for(int j = 0; j < Vleitura[i].length; j++) {
	    		System.out.print(Vleitura[i][j]);
	    	if(Integer.parseInt(Vleitura[i][j]) == 1) {

	    		quant++;
	    }
	    	}
	    	
	    	 // Definindo a paridade de toda linha de bits na horizontal
	    	 switch(escolha) {
	 	    case 1: 
	 	    	//System.out.println(quant);
	 	    	if(quant % 2 == 1) {
	 	    		if(i < 5) {
	 	    			ParHori[i] = 0;
	 	    		}
	 	    	} else {
	 	    		if(i < 5) {
	 	    			ParHori[i] = 1;
	 	    		}
	 	    	}
	 	    	break; 
	 	    case 2: 
	 	    	//System.out.println(quant);
	 	    	if(quant % 2 == 0) {
	 	    		if(i < 5) {
	 	    			ParHori[i] = 0;
	 	    		}
	 	    	} else {
	 	    		if(i < 5) {
	 	    			ParHori[i] = 1;
	 	    		}
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
 	    		Hori = 0; // colocar no final do Array 
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
	    System.out.println("\n\n\n");
	    //Leitura dos Bits na Vertical
	    	for(int i = 0; i < 5; i++) {
	    		for(int j = 0; j < 7; j++) {
	    			guard[j] = Integer.parseInt(Vleitura[j][i]);
	    			System.out.print(guard[j]);
	    		}
	    		System.out.println("");
	    		quant = 0;
	    	    for(int v = 0; v < guard.length; v++) {
	    	    	//System.out.println(guard.length);
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
	 	    		Vert = 0; //colocar no final do Arry ParVert
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

	 	
	 	  //Colocar a leitura da tabela de 8 linhas e 6 colunas aqui
	 	   
	 	   if(Hori == Vert) {
	 		   System.out.println("Mensagem Recebida com Sucesso!!");
	 	   } else {
	 		  System.out.println("Mensagem Recebida com Erro!!");
	 	   }
    }
	}
