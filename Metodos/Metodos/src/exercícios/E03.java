package exerc�cios;
import java.util.*;
public class E03 {
public static void sexoidade(){
	Scanner a = new Scanner(System.in);
	int sexo, anoatual, anonasc, idade;
	System.out.println("Qual seu sexo? \nDigite 1 para masculino; \nDigite 2 para feminino.");
	sexo=a.nextInt();
	System.out.println("Qual o ano que voc� nasceu?");
	anonasc=a.nextInt();
	System.out.println("Qual � o ano atual?");
	anoatual=a.nextInt();
	idade=anoatual-anonasc;
	if(sexo==1 && idade>=65){
		System.out.println("Voc� j� pode se aposentar, senhor!");
	}
	else if(sexo==1 && idade<65){
		System.out.println("Voc� ainda n�o pode se aposentar, voc� tem "+idade+" anos! Ainda falta "+(65-idade)+" anos para voc� se aposentar.");
	}
	if(sexo==2 && idade>=60){
		System.out.println("Voc� j� pode se aposentar, senhora!");
	}
	else if(sexo==2 && idade<60){
		System.out.println("Voc� ainda n�o pode se aposentar, voc� tem "+idade+" anos! Ainda falta "+(60-idade)+" anos para voc� se aposentar.");
	}
		
	
	
}
public static void main(String[]args){
		sexoidade();
	}
}