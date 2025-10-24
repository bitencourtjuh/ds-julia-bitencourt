package Exercicios;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, soma, resultado;
		
		System.out.println("Digite os anos: ");
        anos = sc.nextInt();
        
        System.out.println("Digite os meses: ");
        meses = sc.nextInt();
        
        System.out.println("Digite os dias: ");
        dias = sc.nextInt();
        
        int SomasAnos = anos * 365 ;
        int SomaMeses = meses * 30;
        resultado = SomasAnos + SomaMeses + dias;
        
        System.out.println("Ressultado:");
        System.out.println("Com " + anos + " anos, " + meses+ " meses, " + dias + " dias. Temos expresso: " + resultado + " dias");
	}

}
