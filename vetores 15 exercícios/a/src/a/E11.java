package a;
import java.util.*;
public class E11 {
	public static void main(String[]args){
		int a[] = new int [10], i=0, j=0, k=0, numero=0;
		Scanner in = new Scanner (System.in);
		while(i<10){
			System.out.println("Digite o "+ (i+1) + "� valor:");
			a[i] = in.nextInt();
			i++;
		}
		i=0;
		System.out.println("Digite o n�mero que deseja buscar:");
		numero=in.nextInt();
		while(j<10){
			if(a[j]==numero){
				k=k+100;
			}
			else if(a[j]!=numero){
				k=k+0;
			}
			j++;
		}
		if(k>=100){
			System.out.println("O n�mero foi encontrado: "+numero);
		}
		else{
			System.out.println("N�O foi encontrado");
		}
	}
}
//OK