package a;
import java.util.*;
public class E13 {
	public static void main(String[]args){
	int a[] = new int [10], b [] = new int [10], c [] = new int [10], i=0;
	Scanner in = new Scanner (System.in);
	while(i<10){
		System.out.println("Digite o "+ (i+1) +"° valor:");
		a[i] = in.nextInt();
		i++;
	}
	i=0;
	while(i<10){
		if(a[i]%2==0){
			b[i]=1;
		}
		else if(a[i]%2==1){
			b[i]=0;
		}
		i++;
	}
	i=1;
	System.out.println("Vetor B:");
	System.out.print(b[0]+", ");
	while(i<9){
		System.out.print(b[i]+", ");
		i++;
	}
	System.out.print(b[9]+".");
	}
}
//OK
