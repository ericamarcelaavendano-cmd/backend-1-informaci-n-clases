package application;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello world");

        //Aqui empiezan a haber cambios en mi còdigo.
        //Declaraciòn y manipulaciòn de variables
        String name;
        String lasname;
        int age;
        boolean male;
        int birthYear;

        name = "Erica";
        lasname = "Avendaño";
        age = 33;
        male = true;

        //ejecuciòn de variables.
        System.out.println("My name is: " + name);
        System.out.println("My lasname is: " + lasname);
        System.out.println("I am age: " + age   +  "year old");
        System.out.println("Am i male? " + male);

        final int CURRNTYEAR = 2026;

        birthYear = 2026;
        int calculatedAge = CURRNTYEAR - birthYear;
        System.out.println("calculated age: " + calculatedAge);
        for (int i = 1; i<= 10; i++){
            System.out.println("interation: " + i);
        }

    }
}