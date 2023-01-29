package edu.diogo.tema.TiposOperadores;

public class TioposOperadores {
    public static void main(String[] args) {

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.print(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.print(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = -numero;

        System.out.println(numero);

        // incremento

        numero = numero + 1;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        // vai imprimir com o valor desatualizado
        System.out.println(numero++);

        // vai imprimir com o valor anteriormente incrementado
        System.out.println(numero);

        // vai imprimir com o valor atualizado
        System.out.println(++numero);

        boolean variavel = true;

        // modifica apenas detro na função (Vai ser exibido false)
        System.out.println(!variavel);
        // modifica apenas detro na função (Vai ser exibido true)
        System.out.println(variavel);
        // para alterar o valor da variavel boleana
        variavel = !variavel;
        System.out.println(variavel);

        // operador ternario ?:

        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * String resultado = "";
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO

        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println("operador ternario resultado: " + resultado);

        // Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual ao numero 2: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 maior que numero 2: " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 menor que numero2 : " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero 1 maior ou igual que numero 2: " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero 1 menor ou igual que numero 2: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de numero 2: " + simNao);

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        // Comparar objetos utilizar o metodo equals

        String nomeUm = "Diogo";
        String nomeDois = new String("Diogo");

        System.out.println(nomeUm.equals(nomeDois));

        // Operadores Lógicos

        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");

        /*
         * A duplicidade nos operadores lógicos é um recurso conhecido como
         * Operador Abreviado, isso quer que se a condição1 atender aos critérios
         * não será necessário validar a condição2.
         */

        int numero4 = 1;
        int numero5 = 1;

        if (numero4 == 2 & numero5++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 4 agora é " + numero4);
        System.out.println("O numero 5 agora é " + numero5);

    }
}
