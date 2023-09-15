package org.lessons.java.geometria;

public class Rettangolo {

	int base;
	int height;
	
	Rettangolo(int base, int height) {
		this.base = base;
		this.height  = height;
	}
	
	public int calcoloArea() {
		int area = base * height;
		return area;
	}
	
	public int calcolaPerimetro() {
		int perimetro = (base + height) * 2;
		return perimetro;
	}
	
}
