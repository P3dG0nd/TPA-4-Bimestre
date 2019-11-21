package a;
import java.util.*;
public class E15{
	public static void main(String[]args){
		int a[] = new int [10], i=0, j=9, k=0, aux=0;
		Scanner in =new Scanner(System.in);
		while(i<10){
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = in.nextInt();	
			i++;
		}
		i=0;
		while(i<10){
			k=0;
		while(k<i){
			if(a[i] < a[k]){
			aux = a[i];
			a[i] = a[k];
			a[k] = aux;	
			}
			k++;
		}
		i++;
		}
		i=0;
		System.out.println("Ordem Crescente: \n");
		while(i<10){
			System.out.print("["+a[i]+"]");
			i++;
		}
		i=0;
		while(i<10){
			k=0;
		while(k<i){
			if(a[i] > a[k]){
			aux = a[i];
			a[i] = a[k];
			a[k] = aux;	
			}
			k++;
		}
		i++;
		}
		i=0;
		System.out.println("\n");
		System.out.println("Ordem Decrescente: \n");
		while(i<10){
			System.out.print("["+a[i]+"]");
			i++;
		}
	}
}
