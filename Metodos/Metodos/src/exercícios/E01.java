package exercícios;
import java.util.*;
public class E01 {
	public static void fatorial() {
		Scanner a = new Scanner(System.in);
	int f=0,valor;
	System.out.println("Digite o valor para o fatorial:");
	valor=a.nextInt();
	f=1;
	do{
		f=f*valor;
		valor--;
	}while(valor>1);
	System.out.println("O fatorial desse númerio é: "+f);
	}
	public static void main(String[]args){
	fatorial();	
	}
}
