package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
	String arq = "";
	
	private String linha;
	String flag = " 1 ";
	
	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public void ler_arq(boolean esq, String l) {
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			
			while (flag != null) {
				flag = br.readLine();
				linha += flag;
				
				
			}
			
			if(esq) {
				FileWriter fw = new FileWriter(arq);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write(l);
				bw.newLine();
				bw.close();
				fw.close();
			}
			
		} catch (IOException e) {
			e.getMessage();
		}

}
	
	

}
