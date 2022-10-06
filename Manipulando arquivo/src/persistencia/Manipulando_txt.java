package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dominio.Strings;

public class Manipulando_txt {
	File arq = new File("C:\\Users\\Aluno\\Documents\\APDS\\software\\teste\\Alunos");
	
	String linha;
	String it_line[] = new String[3];
	
	ArrayList<Strings> lista = new ArrayList<Strings>();
	Strings l1 = new Strings();
	
	public void ler_arq() {
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			
			linha = br.readLine();
			while (linha != null) {
				linha = br.readLine();
				
				for(int i = 0; i > 3; i++) {
				it_line = linha.split(";");
				}
				l1.setMatricula(it_line[0]);
				l1.setNome(it_line[1]);
				l1.setSalario(it_line[2]);
				
				lista.add(l1);
				
			}
			
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
}
