import java.util. *;
public class Exerc_1 {
	public static void main (String[] args) {
		double x = valor_investido(0,0,0);
		System.out.println("Novo valor: R$"+x);
	}
	public static double valor_investido (double vlr_invst, double n_meses, double nv_vlr) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor investido:");
		vlr_invst = ler.nextDouble();
		System.out.println("Quantos meses o dinheiro ficou investido?");
		n_meses = ler.nextDouble();
		nv_vlr = (vlr_invst + (0.01 * vlr_invst));
		return(nv_vlr);
	}
}
