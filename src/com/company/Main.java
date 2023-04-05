package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her



        // System.out.println(Studens(22,22)); //еще один вариант для компиляции
        // System.out.println(Studens(18,25));
        // System.out.println(Studens(46,10));

       

        String student1 = Studens(22, 25);
        System.out.println("student1 = " + student1);

        String student2 = Studens(18, 25);
        System.out.println("student2 = " + student2);

        String student3 = Studens(46, 10);
        System.out.println("student3 = " + student3);


    }

    public static String Studens(int age, int weath) {

        if (age > 20 && age < 45 || weath > -20 && weath < 30) {
            return "можно идти гулять";
        }
        if (age < 20 || weath > 0 && weath < 28) {
            return "можно идти гулять";
        }

        if (age > 45 || weath > -10 && weath < 25) {
            return "можно идти гулять";
        }
        return null;
    }
}

