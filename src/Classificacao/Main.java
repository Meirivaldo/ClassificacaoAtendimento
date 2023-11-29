package Classificacao;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalTime nowNow = LocalTime.now();
        Random number = new Random();

        String name;
        String timeNow = "";
        int timeWait;
        int  mOrF;
        String mOrFString = "";

        System.out.println("What's your name: ");
        name = scan.next();
        System.out.println("Do you is a male or female? " );
        System.out.println("Type 1 for male or type 2 for female. ");
        mOrF = scan.nextInt();
        if (mOrF == 1){
            mOrFString = "Mr. ";
        } else if (mOrF == 2) {
            mOrFString = "Mrs. ";
        }

        if(nowNow.isAfter(LocalTime.of(6, 0,0)) && nowNow.isBefore(LocalTime.of(11, 59,59))){
            timeNow = "Good morning!";
        } else if (nowNow.isAfter(LocalTime.of(12,0,0)) && nowNow.isBefore(LocalTime.of(17,59,59))){
            timeNow = "Good afternoon!";
        } else {
            timeNow = "Good evening!";
        }
        System.out.println(mOrFString + name + ", " + timeNow);

        System.out.println("How long do you wait?" + "\n" + "Type in minutes");
        timeWait = scan.nextInt();
        String converter = "";

        if(timeWait <= 10){
            converter = "A";
        } else if (timeWait <= 30) {     // Não imprimir a categoria
            converter = "B";
        } else if (timeWait <= 50) {
            converter = "C";
        } else if (timeWait <= 60) {
            converter = "C";
        } else
            converter = "No is urgent";

        System.out.println("Please wait, we are generating your receipt and password.");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\n");
            System.out.println("--------------------------------------------------------------------------");
        System.out.println(mOrFString + name + ", your time wait is " + timeWait + ", this is case your category is " + "'" + converter + "'" + ".");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\n");


        System.out.println("Wait your password...");
        System.out.println("Don't share with anyone!");
        try{
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        int numberAleatory = number.nextInt(99999);
        System.out.println("Your password is: 23" + numberAleatory);
        System.out.println("See you later! " + mOrFString + name + ("\n") + timeNow);
    }

}