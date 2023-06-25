package es.daniel.figuras;

import java.util.ArrayList;

public abstract class Figure {
	String name;
	String type;
	String angles;

	
	ArrayList<String> classification = new ArrayList<String>();
	
	void create() {
		System.out.println("Create " + name);
		System.out.println("Selecting number of sides");
		System.out.println(type);
		System.out.println(angles);
		for(int i = 0; i < classification.size(); i++) {
			System.out.println("   " + classification.get(i));
		}
	}
	
	void build() {
		System.out.println("Figura geometrica");
	}
	
	
	
	public String getName() {
		return name;
	}
}
