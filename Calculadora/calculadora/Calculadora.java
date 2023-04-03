package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		
		do {
			System.out.println("\n");
			System.out.println("***Calculadora***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir de la calculadora");
			System.out.println("Introduzca una opcion valida: ");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			if(opcion<0 || opcion>5) {
				System.out.println("Opción no válida, vuelva a introducir una opción");
			}else if(opcion != 0) {
				System.out.println("\n");
				float numero1,  numero2;
				
				System.out.println("Introduzca el primer numero: ");
				numero1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("Introduzca el segundo numero: ");
				numero2 = Float.parseFloat(sc.nextLine());
				
				System.out.println("\n");
				switch(opcion) {
				
				case 1: 
					System.out.println("El resultado de la suma es " + (numero1 + numero2));
					break;
				case 2: 
					System.out.println("El resultado de la resta es " + (numero1 - numero2));
					break;
				case 3: 
					System.out.println("El resultado de la multiplicacion es " + (numero1 * numero2));
					break;
				case 4: 
					System.out.println("El resultado de la division es " + (numero1 / numero2));
					break;
				case 5: 
					System.out.println("El resto es " + (numero1 % numero2));
					break;
				}
			}
		}while(opcion != 0);
		
		sc.close();
		System.out.println("Gracias por usar nuestra calculadora");

	}

}
