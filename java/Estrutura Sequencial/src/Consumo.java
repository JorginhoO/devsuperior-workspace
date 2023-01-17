/*
 Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km;
        double combustível, consumoMedio;

        System.out.print("Distancia percorrida: ");
        km = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustível = sc.nextDouble();

        consumoMedio = km / combustível;

        System.out.printf("Consumo medio = %.3f%n", consumoMedio);
        
    }
}
