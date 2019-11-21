package a;
import java.util.*;
public class E02 {
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	int a[] = new int [5];
	int i=0, j=1;
	while(i<5){
		System.out.println("Digite o "+ (i+1) + "° valor:");
		a[i] = in.nextInt();
		i++;
	}
	i=0;
	System.out.println("Tabuada: \n");
	while(i<5){
		System.out.println("Tabuada do " + a [ i ] + ".");
		while(j<=10){
			System.out.println( a[ i ] + " X " + j + " = " + (a[i] * j));
			j++;
			}
		j=1;
		i++;
		System.out.println("");
		}
	}
}
//OK