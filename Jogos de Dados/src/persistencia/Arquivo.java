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

	public void ler_arq() {
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			
			while (flag != null) {
				flag = br.readLine();
				linha += flag;
				
				
			}
			
		} catch (IOException e) {
			e.getMessage();
		}

}
	
	public void set_arq(String h) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq))) {
			
			bw.write(h);
			
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


