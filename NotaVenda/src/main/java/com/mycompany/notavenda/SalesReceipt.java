package com.mycompany.notavenda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesReceipt {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Map<String, Double> productPrices = new HashMap<>();
        Map<String, Integer> productQuantities = new HashMap<>();

        productPrices.put("manteiga", 5.00);
        productPrices.put("Milho de Pipoca", 4.50);
        productPrices.put("Refrigerante 1L", 3.00);
        productPrices.put("Azeite de oliva", 10.00);
        productPrices.put("Leite em po", 3.50);
        productPrices.put("Arroz", 7.50);
        productPrices.put("Feijão", 6.20);
        productPrices.put("Macarrão", 4.80);
        productPrices.put("Açúcar", 3.90);
        productPrices.put("Farinha de trigo", 4.50);
        productPrices.put("Óleo de soja", 8.30);
        productPrices.put("Café", 10.00);
        productPrices.put("Leite", 4.00);
        productPrices.put("Pão", 5.50);
        productPrices.put("Biscoitos", 3.20);
        productPrices.put("Suco em pó", 1.50);
        productPrices.put("Sabão em pó", 12.00);
        productPrices.put("Papel higiênico", 9.80);
        productPrices.put("Frango", 12.50);
        productPrices.put("Ovos", 10.00);

        double totalSaleValue = 0;

        for (String product : productPrices.keySet()) {
            System.out.print("Quantos " + product + " voce gostaria de comprar? ");
            int quantity = inputScanner.nextInt();
            productQuantities.put(product, quantity);
        }

        System.out.println("\n--- Sales Receipt ---");
        System.out.printf("%-10s %-10s %-10s\n", "Product", "Quantity", "Price (R$)");
        for (String product : productPrices.keySet()) {
            int quantity = productQuantities.get(product);
            double price = productPrices.get(product);
            double totalProductPrice = quantity * price;
            totalSaleValue += totalProductPrice;
            System.out.printf("%-10s %-10d R$%-10.2f\n", product, quantity, totalProductPrice);
        }

        System.out.printf("\nTotal Sale Value: R$%.2f\n", totalSaleValue);
    }
}
