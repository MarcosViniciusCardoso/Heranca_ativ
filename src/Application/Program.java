package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();

		System.out.print("Quantos produtos quer cadastrar? ");
		int n = sc.nextInt();

		for (int i = 1; i <=  n; i++) {
			System.out.print("O produto é (C / U / I ) ");
			char x = sc.next().charAt(0);
			
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			
			if (x == 'u' || x == 'U') {
				
				System.out.print("Data de fabricação ");
				Date data = sdf.parse(sc.next());

				list.add(new UsedProduct(nome, price, data));
				
			}else if(x == 'c' || x == 'C') {
		
				list.add(new Product(nome, price));
				
			}else if (x == 'i' || x == 'I') {
				
				System.out.print("Taxa alfandegária: ");
				Double taxa = sc.nextDouble();
				list.add(new ImportedProduct(nome, price, taxa));
			}
			
		}
		System.out.println();
		System.out.println("Tags de Preços: ");
		for(Product produto: list) {
			System.out.println(produto.priceTag());
		}

		

	}

}
