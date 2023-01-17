/*
 Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        
        System.out.print("Base do retangulo: ");
        x = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        y = sc.nextDouble();

        double area = x * y;
        double perimetro = 2 * (x + y);
        double diagonal = Math.sqrt(x * x + y * y);
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL =  %.4f%n", diagonal);
    }
}
