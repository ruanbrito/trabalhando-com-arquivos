package exercicio_fixacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		String path = "/home/ruan/Documentos/produtos.txt";

		File source = new File(path);
		String sourceFolder = source.getParent();

		boolean success = new File(sourceFolder + "/out").mkdir();

		String targetFile = sourceFolder + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(source))) {

			String itemCsv = br.readLine();

			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String nome = fields[0];
				double valor = Double.parseDouble(fields[1]);
				int qtd = Integer.parseInt(fields[2]);

				list.add(new Product(nome, valor, qtd));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

				for (Product p : list) {
					bw.write(p.getNome() + "," + String.format("%.2f", p.totalValor()));
					bw.newLine();
				}
				System.out.println(targetFile + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		scn.close();
	}

}
