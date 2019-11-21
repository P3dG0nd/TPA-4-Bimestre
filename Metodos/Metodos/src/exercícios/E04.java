package exercícios;
import java.util.*;
public class E04 {
	public static void potencia() {
		Scanner in = new Scanner(System.in);
		int base, expoente, i;
		System.out.println("Digite a base:");
		base = in.nextInt();
		System.out.println("Digite o expoente:");
		expoente = in.nextInt();
		int resultado=base;
		for (i = 1; i < expoente; i++) {
		        resultado = resultado * base;
		}
		System.out.println("O resultado é: "+resultado);
	}
	public static void main(String[]args) {
		potencia();
		
	}
}
