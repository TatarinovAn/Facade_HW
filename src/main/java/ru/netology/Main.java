package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();


        System.out.println("Сумма: " + bins.sum("1001001", "1011100"));
        System.out.println("Сумма: " + bins.sum("100", "111"));


        System.out.println("Умножение: " + bins.mult("10", "11"));
        System.out.println("Умножение: " + bins.mult("111", "101"));


    }
}