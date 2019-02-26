package ru.itpark;

public class Main {

    public static void main(String[] args) {

      CashBackService service = new CashBackService();
        System.out.println("Ваш кешбек = " + service.calculate(5_000,2_000,1_000) + " руб.");
    }
}
