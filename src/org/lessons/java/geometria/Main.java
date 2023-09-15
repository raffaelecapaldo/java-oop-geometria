package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Rettangolo[] rettangoli = new Rettangolo[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Inserisci base rettangolo " + (i+1) + ": ");
			int base = sc.nextInt();
			System.out.print("Inserisci area rettangolo " + (i+1) + ": ");
			int height = sc.nextInt();
			
			rettangoli[i] = new Rettangolo(base, height);
		}
		
		sc.close();
		
		for (int i = 0; i < rettangoli.length; i++) {
			rettangoli[i].calcolaPerimetro();
			rettangoli[i].calcoloArea();
			rettangoli[i].printInfo(i+1);
			rettangoli[i].printMath();
			rettangoli[i].draw();
			System.out.println("\n-------------------------");
		}
		

		
		
		
	}

}
