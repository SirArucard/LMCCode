import java.util.Scanner;

public class LMC {
    public static void main(String[] args) {
        imprimeTitulo();
        }
    public static void imprimeTitulo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Bem vindo ao cálculo de MMC!");
        System.out.println("Aqui você poderá calcular o MMC entre n números");
        System.out.println("Digite 1 para continuar: ");
        System.out.println("===============================================");
        int opcao = entrada.nextInt();
        while (opcao != 1) {
            System.out.println("Digita 1 ai faz favô.");
            opcao = entrada.nextInt();
        }
        System.out.println("\n\n Show! Vamos começar?");
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
    public static int[] recebeNum(int[] num){
        System.out.println("Me fala quais numeros voce quer tirar MMC:(Digite numero a numero e aperte enter) (Digite 0 ao concluir)");
        
    }
    }