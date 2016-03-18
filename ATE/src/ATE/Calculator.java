package ATE;

public class Calculator{
	//Fields
			private double a;
			private double b;
			private double c;
			
			private static Calculator instance = null;
			
			protected Calculator() {
				
			}
			
			public static Calculator getInstance() {
				if (instance == null) {
					instance = new Calculator();
				}
				return instance;
			}
			//Constructor
			Calculator(double a, double b){
				this.setA(a);
				this.setB(b);
			}
			
						
			//Methods
			
			public double plus(double a, double b) {
				c = a + b;
				return c;
			}
			
			public double minus(double a, double b) {
				c = a - b;
				return c;
			}

			public double multiply(double a, double b) {
				c = a * b;
				return c;
			}
			
			public double divide(double a, double b) {
				c = a / b;
				return c;
			}

			public double getA() {
				return a;
			}

			public void setA(double a) {
				this.a = a;
			}

			public double getB() {
				return b;
			}

			public void setB(double b) {
				this.b = b;
			}
}
