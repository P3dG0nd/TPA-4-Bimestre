import java.util.*;
public class Exerc_2 {
	public static void main(String[]args) {
		double totalGasto;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o quanto que voc� gastou:");
		totalGasto = in.nextDouble();
		double x = ler_op�ao(0, totalGasto);
	}
	public static double ler_op�ao(double op, double totalGasto) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o n�mero da op��o desejada:");
		System.out.println("Op��o [1]: a vista com 10% de desconto:");
		System.out.println("Op��o [2]: em duas vezes(pre�o de etiqueta)");
		System.out.println("Op��o [3]: de 3 at� 10 vezes com 3% de juros compostos ao m�s (somente para compras acima de R$100,00)");
		op = ler.nextInt(); 
		if(op == 1) {
			double y = opcao1(0, totalGasto);
		} else if(op == 2) {
			double z = opcao2(0, totalGasto);
		} else if (op == 3) {
			double w = opcao3(0,totalGasto, 0, 0, 0);
		}
		return totalGasto;
	}
	public static double opcao1(double des, double totalGasto) {
		des = totalGasto * 0.1;
		return des;
	}
	public static double opcao2(double parc, double totalGasto) {
		parc = totalGasto/2;
		return parc;
	}
	public static double opcao3(double parcela, double totalGasto, double parcelas, int k, int l) {
		Scanner ler=new Scanner(System.in);
		if(totalGasto>100) {
		System.out.println("Digite o n/ de m�ses que voc� vai pagar");
		int j;
		j=ler.nextInt();
		if(j<3) {
			System.out.println("Inv�lido!");
		}
		else if(j>10) {
			System.out.println("Inv�lido!");
		}
		parcela = 0;
		for (int i = 3; i <= j; i++) {
			parcelas += totalGasto + (totalGasto * 0.3);
		}
		parcela = parcelas/j;
		}
		else if(totalGasto<=100) {
			System.out.println("Essa op��o s� ser� feita se voc� gastar R$100,00 em compras.");
		}
		return parcela;
	}
}

