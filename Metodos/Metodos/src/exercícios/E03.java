package exercícios;
import java.util.*;
public class E03 {
public static void sexoidade(){
	Scanner a = new Scanner(System.in);
	int sexo, anoatual, anonasc, idade;
	System.out.println("Qual seu sexo? \nDigite 1 para masculino; \nDigite 2 para feminino.");
	sexo=a.nextInt();
	System.out.println("Qual o ano que você nasceu?");
	anonasc=a.nextInt();
	System.out.println("Qual é o ano atual?");
	anoatual=a.nextInt();
	idade=anoatual-anonasc;
	if(sexo==1 && idade>=65){
		System.out.println("Você já pode se aposentar, senhor!");
	}
	else if(sexo==1 && idade<65){
		System.out.println("Você ainda não pode se aposentar, você tem "+idade+" anos! Ainda falta "+(65-idade)+" anos para você se aposentar.");
	}
	if(sexo==2 && idade>=60){
		System.out.println("Você já pode se aposentar, senhora!");
	}
	else if(sexo==2 && idade<60){
		System.out.println("Você ainda não pode se aposentar, você tem "+idade+" anos! Ainda falta "+(60-idade)+" anos para você se aposentar.");
	}
		
	
	
}
public static void main(String[]args){
		sexoidade();
	}
}