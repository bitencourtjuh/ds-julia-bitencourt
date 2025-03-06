public class exercicio1 {
    public static void main(String[] args) {
        int number1 = 10;  
        int number2 = 5;   
        int resultSoma;
        int resultSubtracao;
        int resultMult;
        int resultDiv;

        // Imprime os números
        System.out.println("Número 1: " + number1);
        System.out.println("Número 2: " + number2);

        // Realiza as operações
        resultSoma = number1 + number2;
        resultSubtracao = number1 - number2;
        resultMult = number1 * number2;
        resultDiv = number1 / number2;

        // Imprime os resultados
        System.out.println("Soma: " + resultSoma);
        System.out.println("Subtração: " + resultSubtracao);
        System.out.println("Multiplicação: " + resultMult);
        System.out.println("Divisão: " + resultDiv);
    }
}
