package es.daniel.figuras;

public abstract class FigureStore {
	
	abstract Figure createFigure(String item);
	
	public Figure buildFigure(String type) {
		Figure figure = createFigure(type);
		System.out.println("--- Bulding a " + figure.getName() + " ---");
		figure.create();
		figure.build();
		return figure;
	}
}
