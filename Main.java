import java.util.Scanner;
    // Classe principal do código
public class Main {
    public static void main(String[] args) {
        imprimeTitulo();
        int[] numeros = recebeNum();
        int resultadoMmc = executaMDC(numeros);
        System.out.println("O MMC dos números informados é: " + resultadoMmc);

        }
        // Classe que imprime um menuzinho na tela
    public static void imprimeTitulo(){
        
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Bem vindo ao calculo de MMC!");
        System.out.println("Aqui voceh poderah calcular o MMC entre n numeros");
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
        // Classe que pede a quantidade de numeros que o usuário quer fazer o MMC, calculando o tamanho do array 
    public static int[] recebeNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("De quantos numeros você quer tirar o MMC?");
        int tamDoArray = entrada.nextInt();
        int [] numeros = new int[tamDoArray];
        for (int i = 0; i < tamDoArray; i++) {
            System.out.println("Beleza, agora digita o " + (i+1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Show, agora vamos resolver o MMC");

        return numeros;
        
    }
        // Aqui executamos a raiz da questão, testando valor por valor do array com numeros primos
    public static int executaMDC(int[] numeros){
        int totalMmc = 1;
        int divPrimo = 2;
        imprimeMacete(numeros, divPrimo);
        while (!SaoUm(numeros)) {
            boolean divide = false;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % divPrimo == 0) {
                    numeros [i] = numeros[i] / divPrimo;
                    divide = true;
                }
            }
            if (divide) {
                totalMmc = totalMmc * divPrimo;
                imprimeMacete(numeros, divPrimo);
            } else {
                divPrimo++;
            }
            }
            return totalMmc;
        }
        // Classe que serve apenas pra ser usada no while do código principal e parar de rodar quando todos numeros são 1 no array
    public static boolean SaoUm(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] != 1) {
            return false; 
        }
    }
    return true;
    }
        // Impressão na tela bonitinha do macete, pelo menos é assim que o Marcos chama
    public static void imprimeMacete(int[] numeros, int divisor) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.print("| " + divisor);
        System.out.println();
    }
}
