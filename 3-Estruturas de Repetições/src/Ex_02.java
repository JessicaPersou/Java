import java.util.Scanner;
public class Ex_02 {
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	public static void main(String[] args) {
		int n, x, mostraPar=0, mostraImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<=10;x++) {
			System.out.println("Informe o n�mero desejado: ");
			n = leia.nextInt();
			
			if(n%2==0) {
				mostraPar+=1;
				}
			if(n%2!=0){
				mostraImpar+=1;
			}	
					
		}	System.out.println("Pares s�o:  " + mostraPar);
			System.out.println("Impares s�o: " + mostraImpar);	
	}
}