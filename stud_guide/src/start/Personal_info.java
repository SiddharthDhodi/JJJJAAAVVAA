package start;

import java.util.Scanner;

public class Personal_info {
    public void personalinfo()

    {

        System.out.println();
        System.out.println("           _Welcome to Career World Counseling Centre_");
        System.out.println();

//        Personal Information_

        System.out.println("_Enter Your Personal Information_");
        System.out.println();

        System.out.println("Enter Your Name...");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();

        System.out.println("Enter Your Marks In SSC/HSC");
        Scanner Marks = new Scanner(System.in);
        Marks.nextInt();

        System.out.println("Congratulations " + Name + " Your Scored Very Good Marks... ");

        System.out.println();

        System.out.println("What are Your Hobbies.... ");
        Scanner hobbies = new Scanner(System.in);
        hobbies.nextLine();

        System.out.println("What are Your Biggest Dream in Life.... ");
        Scanner Dream = new Scanner(System.in);
        Dream.nextLine();

        System.out.println("Is you like to Play Sports (Yes/no) & Which Game??.... ");
        Scanner Sports = new Scanner(System.in);
        Sports.nextLine();

        System.out.println("Yes Very good " + Name + " You have nice Hobbies... ");

        System.out.println();

        System.out.println("For Which standard You Want Career Information...\nFor After Class 10 /12");
        Scanner std = new Scanner(System.in);
        int standard = std.nextInt();

        System.out.print("_________________________________________________");
        System.out.println();
    }
}

