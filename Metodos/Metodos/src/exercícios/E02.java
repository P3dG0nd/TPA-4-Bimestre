package exercícios;
import java.util.*;
public class E02 {
	public static void tabuada(){
	int	n, m, i, r=0;
	Scanner in = new Scanner(System.in);
	System.out.println("Digite o valor:");
	n=in.nextInt();
	System.out.println("Digite a quantidade de multiplicadores:");
	m=in.nextInt();
	for(i=-1; m>i; m--){
		r=n*m;
		 System.out.println(n+" X "+m+" = "+r);
	}
	}
	public static void main(String[]args){
		tabuada();
	}
}
