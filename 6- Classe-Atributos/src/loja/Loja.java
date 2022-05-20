package loja;

import produto.Produto;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.printf("Informe o Produto que deseja guardar:\n");
		
		p1.nome = sc.nextInt();
		

	}

}
