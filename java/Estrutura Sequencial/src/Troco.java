/*
 Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
 */

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario, qtdProduto, dinheiroRecebido, troco;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtdProduto = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        troco = precoUnitario * qtdProduto - dinheiroRecebido;

        System.out.printf("TROCO = %.2f%n", Math.abs(troco));
    }
}
