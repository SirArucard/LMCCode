import java.util.Scanner;
    // Classe principal do código
    // De forma resumida: Chamamos a função que imprime o titulo, depois declaramos um array que recebe os numeros de retorno da função recebNum
    // declaramos uma variavel que recebe a função que executa o mmc e retorna o resultado
public class Main {
    public static void main(String[] args) {
        imprimeTitulo();
        int[] numeros = recebeNum();
        int resultadoMmc = executaMDC(numeros);
        System.out.println("O MMC dos números informados é: " + resultadoMmc);

        }
        // Classe que imprime um menuzinho na tela, sem nenhum segredo
    public static void imprimeTitulo(){
        
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Bem vindo ao calculo de MMC!");
        System.out.println("Aqui voceh poderah calcular o MMC entre n numeros");
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
        // Classe que pede a quantidade de numeros que o usuário quer fazer o MMC, calculando o tamanho do array
        // Ela pede ao usuário a quantidade de numeros e guarda esse valor numa variável que será lida como quantos numeros nosso array terá
        // Depois disso criamos um for que passa e armazena cada valor que será usado para o MMC em uma posição diferente (Os indices)
    public static int[] recebeNum(){
    public static int[] recebeNum(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("De quantos numeros você quer tirar o MMC?");
    int tamDoArray = entrada.nextInt();
    int [] numeros = new int[tamDoArray];
    
    for (int i = 0; i < tamDoArray; i++) {
        int valorLido = 0;
        
        // Proteção: Enquanto o valor for menor ou igual a 0, repete a pergunta
        while (valorLido <= 0) {
            System.out.println("Beleza, agora digita o " + (i+1) + "º número:");
            valorLido = entrada.nextInt();
            
            if (valorLido <= 0) {
                System.out.println("Zero nao vai ta rolando, escreve um numero inteiro");
            }
        }
        numeros[i] = valorLido;
    }
    System.out.println("Show, agora vamos resolver o MMC");

    return numeros;
}

        // Aqui executamos a raiz da questão, testando valor por valor do array com numeros primos
        // Declaramos duas variáveis, uma pra guardar o valor total do MMC e uma que será o divisor primo
        // Criamos um while que tem como parametro a NEGAÇÃO (!) da função SaoUm, que será explicada lá na linha dela
        // Com essa função booleana, conseguimos rodar esse while, numero a numero do nosso array e realizar a divisão com teste de resto (usando %) para calcular 
        // Fora do while chamamos um if para chamar a função que imprime na tela o macetinho como pedido, ex.: 10 10 10 10 | 2
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
        // Classe que serve apenas pra ser usada no while da função executaMDC e parar de rodar quando todos numeros são 1 no array
    public static boolean SaoUm(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] != 1) {
            return false; 
        }
    }
    return true;
    }
        // Impressão na tela bonitinha do macete, foi assim que cê chamou professor, acho né? kkk
        // Sem muito segredo ele simplesmente passa pelo array imprimindo cada numero e fora do for ele puxa a | + o divisor pra ficar na ordem
        // Lembra um pouco o que fizemos pra imprimir os letrão, de uma forma ou outra 
    public static void imprimeMacete(int[] numeros, int divisor) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.print("| " + divisor);
        System.out.println();
    }
}
