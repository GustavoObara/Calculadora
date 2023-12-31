/**
 * Projeto: Calculadora
 * Descrição: Uma calculadora simples com operações de soma, subtração, multiplicação e divisão.
 * Autor: Luiz Obara
 * Data: 15/11/2023
 */

package calculadora;

/**
 * Classe principal que contém o método main para testar as operações da calculadora.
 */
public class Calculadora {

    public static void main(String[] args) {

        // Instanciando objetos para cada operação
        Somar sum        = new Somar();
        Subtrair sub     = new Subtrair();
        Dividir div      = new Dividir();
        Multiplicar mult = new Multiplicar();

        /*==============Teste Somar===========*/
        System.out.println("\n==============Teste Somar==============");

        // Primeiro teste: dois números inteiros positivos
        int teste_sum1 = sum.somar(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_sum1);

        // Segundo teste: dois números inteiros negativos
        int teste_sum2 = sum.somar(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_sum2);

        // Terceiro teste: um número inteiro positivo e um número inteiro negativo
        int teste_sum3 = sum.somar(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_sum3);

        // Quarto teste: dois números nulos
        int teste_sum4 = sum.somar(0,0);
        System.out.println("Quarto teste, dois números nulos: " + teste_sum4);

        // Quinto teste: um número nulo e um número inteiro positivo
        int teste_sum5 = sum.somar(100,0);
        System.out.println("Quinto teste, dois números um nulo e um positivo: " + teste_sum5);

        // Sexto teste: um número nulo e um número inteiro negativo
        int teste_sum6 = sum.somar(-100,0);
        System.out.println("Sexto teste, dois números um nulo e um negativo: " + teste_sum6);



        /*==============Teste Subtrair===========*/
        System.out.println("\n==============Teste Subtrair==============");

        // Primeiro teste: dois números inteiros positivos
        int teste_sub1 = sub.subtrair(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_sub1);

        // Segundo teste: dois números inteiros negativos
        int teste_sub2 = sub.subtrair(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_sub2);

        // Terceiro teste: um número inteiro positivo e um número inteiro negativo
        int teste_sub3 = sub.subtrair(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_sub3);

        // Quarto teste: dois números nulos
        int teste_sub4 = sub.subtrair(0,0);
        System.out.println("Quarto teste, dois números nulos: " + teste_sub4);

        // Quinto teste: um número nulo e um número inteiro positivo
        int teste_sub5 = sub.subtrair(100,0);
        System.out.println("Quinto teste, dois números um nulo e um positivo: " + teste_sub5);

        // Sexto teste: um número nulo e um número inteiro negativo
        int teste_sub6 = sub.subtrair(-100,0);
        System.out.println("Sexto teste, dois números um nulo e um negativo: " + teste_sub6);



        /*==============Teste Dividir===========*/
        System.out.println("\n==============Teste Dividir==============");

        // Primeiro teste: dois números inteiros positivos
        int teste_div1 = div.dividir(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_div1);

        // Segundo teste: dois números inteiros negativos
        int teste_div2 = div.dividir(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_div2);

        // Terceiro teste: um número inteiro positivo e um número inteiro negativo
        int teste_div3 = div.dividir(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_div3);

        // Quarto teste: dois números nulos (Teste comentado devido à divisão por zero)
        /*
        int teste_div4 = div.dividir(0,0);
        System.out.println("Quarto teste, dois números nulos: " + teste_div4);
        */

        // Quinto teste: um número nulo e um número inteiro positivo (Teste comentado devido à divisão por zero)
        /*
        int teste_div5 = div.dividir(100,0);
        System.out.println("Quinto teste, dois números um nulo e um positivo: " + teste_div5);
        */

        // Sexto teste: um número nulo e um número inteiro negativo (Teste comentado devido à divisão por zero)
        /*
        int teste_div6 = div.dividir(-100,0);
        System.out.println("Sexto teste, dois números um nulo e um negativo: " + teste_div6);
        */



        /*==============Teste Multiplicar===========*/
        System.out.println("\n==============Teste Multiplicar==============");

        // Primeiro teste: dois números inteiros positivos
        int teste_mult1 = mult.multiplicar(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_mult1);

        // Segundo teste: dois números inteiros negativos
        int teste_mult2 = mult.multiplicar(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_mult2);

        // Terceiro teste: um número inteiro positivo e um número inteiro negativo
        int teste_mult3 = mult.multiplicar(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_mult3);

        // Quarto teste: dois números nulos
        int teste_mult4 = mult.multiplicar(0,0);
        System.out.println("Quarto teste, dois números nulos: " + teste_mult4);

        // Quinto teste: um número nulo e um número inteiro positivo
        int teste_mult5 = mult.multiplicar(100,0);
        System.out.println("Quinto teste, dois números um nulo e um positivo: " + teste_mult5);

        // Sexto teste: um número nulo e um número inteiro negativo
        int teste_mult6 = mult.multiplicar(-100,0);
        System.out.println("Sexto teste, dois números um nulo e um negativo: " + teste_mult6);

    }
    
}