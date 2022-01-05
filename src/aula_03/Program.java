package aula_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "/home/ruan/Documentos/Java Completo - POO - Prof. Nelio Alves/Seção 17 - Trabalhando com arquivos/in3.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
