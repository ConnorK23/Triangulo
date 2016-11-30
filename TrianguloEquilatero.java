import java.util.Scanner;
public class TrianguloEquilatero {
	public static void main (String[]args){
		System.out.println("Introduce la medida del lado");
		Scanner sc = new Scanner(System.in);
		int lado = sc.nextInt();
		sc.close();
		int perimetro = mostrarPerimetro(lado);
	System.out.printf("El perimetro de lado %d es %d%n",lado, perimetro);
		double altura= Math.sqrt((3*lado*lado/4));
		double area= (lado*altura)/2;
		System.out.printf("El area del triangulo de lado %d es: %.2f%n",lado,area);
	}
	public static int mostrarPerimetro (int lado){
		int perimetro;
		perimetro = 3 * lado;
		return perimetro;
	}	
	
	public static int ResultadoArea(int area){
		return area;
	}
}
		
	
		
	
