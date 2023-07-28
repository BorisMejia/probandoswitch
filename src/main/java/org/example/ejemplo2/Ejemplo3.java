package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        Double temperaAmbiente;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite la temperatura actual: ");
        temperaAmbiente = teclado.nextDouble();
        String temperaturaComoTexto = temperaAmbiente.toString();

        switch (temperaturaComoTexto) {
            case "20":
                temperaAmbiente = 25.0;
                break;
            case "30":
                temperaAmbiente = 20.0;
                break;
            case "40":
                temperaAmbiente = 20.0;

                break;
                default:
                    System.out.print("Querido usuario ingrese la temperatura que desee");
                    temperaAmbiente = teclado.nextDouble();
                    break;
            }
            System.out.println(temperaAmbiente);
        }
    }
