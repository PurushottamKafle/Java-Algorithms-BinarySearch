package com.company;

import java.util.Scanner;

class Main {

    private final int SIZE = 7;

    private int[] mass;
    private int elementToFind;
    private int elementNumber = -1;

    public static void main(String[] args) {
	    Main program = new Main();
	    program.getData();
	    program.binarySearch();
	    program.displayResult();
    }

    Main() {
        mass = new int[SIZE];
    }

    void getData() {
        System.out.println("Enter " + SIZE + " numbers: ");
        setMass();
        System.out.println("Enter element to find: ");
        setElementToFind();
    }

    void setMass() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < SIZE; i++)
            mass[i] = scanner.nextInt();
    }

    void setElementToFind() {
        Scanner scanner = new Scanner(System.in);
        elementToFind = scanner.nextInt();
    }

    void binarySearch() {

    }

    void displayResult() {
        if (elementNumber == -1)
            System.out.println("There is no such element in the massive.");
        else
            System.out.println("Element's number - " + elementNumber);

    }
}
