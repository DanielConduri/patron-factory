package es.daniel.figuras;

public class QuadrilateralFigureStore extends FigureStore {

	Figure createFigure(String item) {
		if(item.equals("square")) {
			return new QuadrilateralSquare();
		} else if(item.equals("rhombus")) {
			return new QuadrilateralRhombus();
		} else if(item.equals("trapezium")) {
			return new QuadrilateralTrapezium();
		} else return null;
	}
}
