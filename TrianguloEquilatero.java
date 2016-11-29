import java.util.Scanner;
public class TrianguloEquilatero {
	public static void main (String[]args){
		System.out.println("Introduce la medida del lado");
		Scanner sc = new Scanner(System.in);
		int lado = sc.nextInt();
		sc.close();
		int perimetro = mostrarPerimetro(lado);
	System.out.printf("El perimetro de lado %d es %d%n",lado, perimetro);
	}
	public static int mostrarPerimetro (int lado){
		int perimetro;
		perimetro = 3 * lado;
		return perimetro;
	}	
}
	
