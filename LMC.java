import java.util.Scanner;

public class LMC {
    public static void main(String[] args) {
        imprimeTitulo();
        recebeNum();

        }
    public static void imprimeTitulo(){
        
        System.out.println("===============================================");
        System.out.println("Bem vindo ao cálculo de MMC!");
        System.out.println("Aqui você poderá calcular o MMC entre n números");
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
    public static int[] recebeNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("De quantos numeros você quer tirar o MMC?");
        int tamDoArray = entrada.nextInt();
        int [] numeros = new int[tamDoArray];
        for (int i = 0; i < tamDoArray; i++) {
            System.out.println("Beleza, agora digita o " + (i+1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Show, agora vamos resolver o MMC"\n);

        return numeros;
        
    }
    public static int executaMMC(int[] numeros){
        

    }
    }