package Aplication;


import java.util.Locale;
import java.util.Scanner;

import entitites.Pessoas;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Pessoas[] lista = new Pessoas[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.nextLine().charAt(0);
			lista[i] = new Pessoas(altura,genero);
			}
			
			double alturaMenor = Pessoas.menorAltura(lista);
			double alturaMaior = Pessoas.maiorAltura(lista);
			double mediaMulheres = Pessoas.mediaGeral(lista);
			int homens = Pessoas.contarHomens(lista);
			
			System.out.println();
			System.out.println("Menor altura = " 
								+ alturaMenor + "\n"
								+ "Maior Altura = "
								+ alturaMaior + "\n"
								+"Media das Altura das mulheres = "
								+ String.format("%.2f", mediaMulheres) + "\n"
								+ "Numero de homens = "
								+ homens
					);
			
			
	sc.close();
	}

}
