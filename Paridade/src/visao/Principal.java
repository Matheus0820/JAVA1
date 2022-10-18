package visao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
				String leitura; 
				String Vleitura[];
				int quant = 0, bitFTrns = 0, bitFRept = 0;
				
				Scanner ler = new Scanner(System.in);
				
				System.out.println("Paridade impar ou par? 1 - impar / 2 - par");
				int escolha = ler.nextInt();
				
			
		    	System.out.println("Digite os Bits: ");
		    	ler.nextLine();
				leitura = ler.nextLine(); 
				
				
			    Vleitura = leitura.split("");
			    
			    quant = 0;
			    for(int i = 0; i < Vleitura.length; i++) {
			    	if(Integer.parseInt(Vleitura[i]) == 1) {
			    		quant++;
			    }
			    }
			    	
			    switch(escolha) {
			    case 1: 
			    	System.out.println(quant);
			    	if(quant % 2 == 1) {
			    		bitFTrns = 0;
			    	} else {
			    		bitFTrns = 1; 
			    	}
			    	break; 
			    case 2: 
			    	System.out.println(quant);
			    	if(quant % 2 == 0) {
			    		bitFTrns = 0;
			    	} else {
			    		bitFTrns = 1; 
			    	}
			    	break; 
			    }
			    
			    
			    System.out.println("Digite os Bits que Chegaram: ");
				leitura = ler.nextLine(); 
			    
				Vleitura = leitura.split("");
			    
			    quant = 0;
			    for(int i = 0; i < 7; i++) {
			    	if(Integer.parseInt(Vleitura[i]) == 1) {
			    		quant++;
			    }
			    }
			    	
			    switch(escolha) {
			    case 1: 
			    	System.out.println(quant);
			    	if(quant % 2 == 1) {
			    		bitFRept = 0;
			    	} else {
			    		bitFRept = 1; 
			    	}
			    	break; 
			    case 2: 
			    	System.out.println(quant);
			    	if(quant % 2 == 0) {
			    		bitFRept = 0;
			    	} else {
			    		bitFRept = 1; 
			    	}
			    	break; 
			    }
			    
			    if(bitFRept == bitFTrns) {
			    System.out.println("Mensagem recebida com Sucesso");
			    
			    } else {
			    	System.out.println("Mensagem recebida com Erro!!");
			    }

			

	}

}
