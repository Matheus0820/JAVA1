import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String r1, r2; 
		String l1[] = new String[4];
		String l2[] = new String[4];
		
		Ponto p1 = new Ponto();
		
		Scanner ler = new Scanner(System.in); 
		
		
		r1 = ler.nextLine();
		//ler.nextLine();
		r2 = ler.nextLine();
		//ler.nextLine();
		
		l1 = r1.split(" ");
		l2 = r2.split(" ");
		
		for(int i = 0; i < 4; i++) {
			System.out.println(l1[i]);
		}
		for(int i = 0; i < 4; i++) {
			System.out.println(l2[i]);
		}
		
		
		p1.getX(); 

	}

}
