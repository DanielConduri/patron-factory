package es.daniel.figuras;

public class App {
	public static void main( String[] args ) {
		
		FigureStore triangleStore = new TriangleFigureStore();
		FigureStore quadrilateralStore = new QuadrilateralFigureStore();
		
		Figure figure = triangleStore.buildFigure("equilateral");
		System.out.println("Daniel ordered a " + figure.getName() + "\n");
		
		Figure secondFigure = quadrilateralStore.buildFigure("rhombus");
		System.out.println("Ely ordered a " + secondFigure.getName() + "\n");
	}
}

