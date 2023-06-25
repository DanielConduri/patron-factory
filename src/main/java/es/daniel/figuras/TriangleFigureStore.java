package es.daniel.figuras;

public class TriangleFigureStore extends FigureStore {

	Figure createFigure(String item) {
		if(item.equals("equilateral")) {
			return new TriangleEquilateral();
		} else if(item.equals("isosceles")) {
			return new TriangleIsosceles();
		} else if(item.equals("scalene")) {
			return new TriangleScalene();
		} else return null;
	}

}
