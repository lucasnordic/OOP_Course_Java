package LecturesGomes.lecture1_0902;

public class ExampleVariables {

	
	public static void main(String[] args) {
		float a = 0.001f;
		float b = 0.001f;
		
		float c = a * 1000;
		
		double d = 0.0;
		for (int i = 0; i < 1000; i++) {
			d = d + b;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		double x = 3 / 3 * 5; //Div > Mult > Sum and Sub.
		System.out.println(x);
		
	}
}
