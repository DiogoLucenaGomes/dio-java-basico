package edu.diogo.tema.anatomiaclasses;

public class BoletimEstudanti {
    public static void main(String[] args) {

        double mediaFinal = 6.0;

        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova de Minerva");
        else
            System.out.println("Reprovado");

    }
}
