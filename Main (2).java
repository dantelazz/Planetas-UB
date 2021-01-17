package Planetas;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Planeta Mercurio = new Planeta("Mercurio", 88);
		Planeta Venus = new Planeta("Venus", 225);
		Planeta Jupiter = new Planeta("Jupiter", 4380);
		Planeta Saturno = new Planeta("Saturno", 10767);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su edad "); 
		float edad = teclado.nextFloat();
		
		System.out.println("Su edad en "+Mercurio.getNombre()+" es: "+Mercurio.oEdad(edad));
		System.out.println("Su edad en "+Venus.getNombre()+" es: "+Venus.oEdad(edad));
		System.out.println("Su edad en "+Jupiter.getNombre()+" es: "+Jupiter.oEdad(edad));
		System.out.println("Su edad en "+Saturno.getNombre()+" es: "+Saturno.oEdad(edad));
	} 
}


