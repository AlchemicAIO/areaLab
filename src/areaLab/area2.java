package areaLab;

public class area2 {
	
		private double length, width, area;
		
		public area2(double length, double width) {
			this.length = length;
			this.width = width;
		}

		public void ResultArea() {
			area = width * length;
		}
		
		public void print() {
			ResultArea();
			System.out.println("The Area of a Rectangle is: " +area);
		}
	}


