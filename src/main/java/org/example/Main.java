package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        Double temperaturaAmbiente;

        System.out.print("Ingrese la temperatura que hay en el ambiente: ");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente == 20.0){
            temperaturaAmbiente = 25.0;
            System.out.print("Querido usuario la temperatura de su ambiente subio a: "+temperaturaAmbiente);
        } else if (temperaturaAmbiente == 30.0) {
            temperaturaAmbiente = 20.0;
            System.out.print("Querido usuario la temperatura de su ambiente bajo a: "+temperaturaAmbiente);
        } else if (temperaturaAmbiente == 40.0) {
            temperaturaAmbiente = 20.0;
            System.out.print("Querido usuario la temperatura de su ambiente bajo a: "+temperaturaAmbiente);
        }else {
            System.out.print("Querido usuario ingrese la temperatura que desee");
            temperaturaAmbiente=teclado.nextDouble();
            System.out.println("Usuario la temperatura cambio a " +temperaturaAmbiente);
        }

    }
}