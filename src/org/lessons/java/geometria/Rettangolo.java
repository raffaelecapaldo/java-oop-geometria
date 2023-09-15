package org.lessons.java.geometria;

public class Rettangolo {

	int base;
	int height;
	int area;
	int perimetro;
	
	Rettangolo(int base, int height) {
		this.base = base;
		this.height  = height;
	}
	
	public int calcoloArea() {
		int area = base * height;
		this.area = area;
		return area;
	}
	
	public int calcolaPerimetro() {
		int perimetro = (base + height) * 2;
		this.perimetro = perimetro;
		return perimetro;
	}
	
	public void printInfo(int id) {
		String info = "Info rettangolo " + id + "\nBase: " + this.base +
					" - Altezza: " + this.height;
		
		System.out.println(info);
	}
	
	public void printMath() {
		String info = "Area: " + this.area + " - Perimetro: " + this.perimetro;
		System.out.println(info);
	}
	
}
