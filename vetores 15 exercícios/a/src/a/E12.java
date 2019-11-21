package a;
import java.util.*;
public class E12 {
	public static void main(String[]args){
		int a[] = new int [10] ,  b[] = new int [10], i=0, j=9, k=0;
		Scanner in =new Scanner(System.in);
		while(i<10){
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = in.nextInt();	
			i++;
		}
		i=0;
		while(i<10 && j>0){
			if(a[i] == a[j]){
				i++;
				j--;
			}
			else if(a[i] != a[j]){
				i=1000;
			}
		}
		if(i>100){
			System.out.println("Não é um palíndromo.");
		}
		else{
			System.out.println("É um palíndromo");
		}
	}
}
//OK