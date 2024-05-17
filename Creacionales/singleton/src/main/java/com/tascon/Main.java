package com.tascon;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- Patron de Diseño Singleton ----------\n");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}