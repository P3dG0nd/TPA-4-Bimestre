/*Criar uma matriz 4x4 
 * de inteiros sendo que cada elemento da matriz 
 * será preenchido com o dobro do elemento anterior 
 * (o elemento[0][0] será o 2).
 */
import java.util.Scanner;
public class exer01 {
	public static void main (String[]args){
	Scanner a = new Scanner(System.in);
	int v[][] = new int[4][4];
	int i, j;
	for(i=0;i<=3;i++){
		for(j=0;j<=3;j++){
			System.out.println("\n Digite o valor de ["+(i+1)+"] e de ["+(j+1)+"] :");
			v[i][j] = a.nextInt();
		
		}
	}
	
	System.out.print("\n :: DOBRO DOS ELEMENTOS :: \n \n");
	for(i=0;i<=3;i++){
		for(j=0;j<=3;j++){
			System.out.print("["+(v[i][j]*2)+"]");
			if(j==3){
				System.out.print("\n");
			}
		}
	}
	}
}
