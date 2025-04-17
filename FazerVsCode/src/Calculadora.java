import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operadores op = new Operadores();

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();

        System.out.println("\nOPERADORES ARITMÉTICOS");
        System.out.println("Adição: " + op.adicao(num1, num2));
        System.out.println("Subtração: " + op.subtracao(num1, num2));
        System.out.println("Multiplicação: " + op.multiplicacao(num1, num2));
        System.out.println("Divisão: " + op.divisao(num1, num2));

        System.out.println("\nOPERADORES DE ATRIBUIÇÃO");
        System.out.println("Atribuição += : " + op.atribuicaoSoma(num1, num2));
        System.out.println("Atribuição -= : " + op.atribuicaoSubtracao(num1, num2));
        System.out.println("Atribuição *= : " + op.atribuicaoMultiplicacao(num1, num2));
        System.out.println("Atribuição /= : " + op.atribuicaoDivisao(num1, num2));

        System.out.println("\nOPERADORES DE COMPARAÇÃO");
        System.out.println("Igual: " + op.igual(num1, num2));
        System.out.println("Diferente: " + op.diferente(num1, num2));
        System.out.println("Maior que: " + op.maiorQue(num1, num2));
        System.out.println("Menor que: " + op.menorQue(num1, num2));
        System.out.println("Maior ou igual: " + op.maiorOuIgual(num1, num2));
        System.out.println("Menor ou igual: " + op.menorOuIgual(num1, num2));

        System.out.println("\nOPERADORES LÓGICOS");

        boolean bool1 = num1 > 10;
        boolean bool2 = num2 > 10;

        System.out.println("true && false: " + op.eLogico(bool1, bool2));
        System.out.println("true || false: " + op.ouLogico(bool1, bool2));
        System.out.println("!true: " + op.naoLogico(bool1));

        
    }
}
