import java.util.*;
public class Exerc_2 {
	public static void main(String[]args) {
		double totalGasto;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o quanto que você gastou:");
		totalGasto = in.nextDouble();
		double x = ler_opçao(0, totalGasto);
	}
	public static double ler_opçao(double op, double totalGasto) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número da opção desejada:");
		System.out.println("Opção [1]: a vista com 10% de desconto:");
		System.out.println("Opção [2]: em duas vezes(preço de etiqueta)");
		System.out.println("Opção [3]: de 3 até 10 vezes com 3% de juros compostos ao mês (somente para compras acima de R$100,00)");
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
		System.out.println("Digite o n/ de mêses que você vai pagar");
		int j;
		j=ler.nextInt();
		if(j<3) {
			System.out.println("Inválido!");
		}
		else if(j>10) {
			System.out.println("Inválido!");
		}
		parcela = 0;
		for (int i = 3; i <= j; i++) {
			parcelas += totalGasto + (totalGasto * 0.3);
		}
		parcela = parcelas/j;
		}
		else if(totalGasto<=100) {
			System.out.println("Essa opção só será feita se você gastar R$100,00 em compras.");
		}
		return parcela;
	}
}

