package es.daniel.figuras;

public class QuadrilateralRhombus extends Figure {

	public QuadrilateralRhombus() {
		name = "Quadrilateral Rhombus";
		type = "3 equal sides TRISOLATERAL, 2 equal sides ISOSSCELS or all sides distinct SCALENE";
		angles = "Will have two acute and two obtuse angles";
		
		classification.add("Area = (D + d) / 2");
	}
}
