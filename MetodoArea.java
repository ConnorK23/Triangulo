import java.util.Scanner;
public class MetodoArea {
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Dime la base ");
		int base = sc.nextInt();
		double altura= Math.sqrt((3*base*base/4));
		double area= (base*altura)/2;
		System.out.printf("El area del triangulo de lado %d es: %.2f%n",base,area);
		sc.close();
	}
		public static int ResultadoArea(int area){
		return area;
	}
}

