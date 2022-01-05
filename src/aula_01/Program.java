package aula_01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file=  new File("/home/ruan/Documentos/Java Completo - POO - Prof. Nelio Alves/Seção 17 - Trabalhando com arquivos/in1");
		Scanner scn = null;
		
		try{
			scn = new Scanner(file);
			while(scn.hasNextLine()) {
				System.out.println(scn.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(scn != null) {
				scn.close();
			}
		}

	}

}
