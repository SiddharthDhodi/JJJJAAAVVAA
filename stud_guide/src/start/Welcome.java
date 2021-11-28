package start;

import start.After12Arts.AfterArt;
import start.AfterClass10.Arts;
import start.AfterClass10.Commerce;
import start.AfterClass10.Science;
import start.AfterClass12.Engineering;
import start.AfterClass12.Medical;
import start.AfterClass12commerce.AFterCOM;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        personalinfo();
        welcome();
        intro();
        work();


        String quali1="10th";
        String quali2="12th science";
        String quali3="12th commerce";
        Scanner jc=new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t----------------------------------");
        System.out.println("\t\t\tPlease tell us your qualification");
        System.out.println("\t\t\t----------------------------------");
        String yourqual=jc.nextLine();
        if (yourqual.equalsIgnoreCase(quali1)) {
            System.out.println("---------------ARTS-----------------");
            Arts a = new Arts();
            a.whatisArts();
            a.forwhowArtsis();
            System.out.println("---------------SCIENCE-----------------");

            Science s = new Science();
            s.WhatisScience();
            s.forwhowScienceis();

            System.out.println("---------------COMMERCE-----------------");

            Commerce c = new Commerce();
            c.whatisCommerce();
            c.forwhowCommerceis();
        }else if (yourqual.equalsIgnoreCase(quali2)){
            Engineering d = new Engineering();
            d.Whatisengineering();
            d.listofengineering();

            Medical v =new Medical();
            v.WhatisMedical();
            v.coursesinMedical();
        }else if (yourqual.equalsIgnoreCase(quali3)){
            AFterCOM m =new AFterCOM();
            m.careeraftercom();

        }
        else {
            AfterArt q=new AfterArt();
            q.careerAfter12arts();
        }
        if (yourqual.equalsIgnoreCase(quali1)) {

            String name;
            int Science, Maths, Socialstudies, English, Hindi;
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------------");
            System.out.println("HELLO WELCOME TO CAREER GUIDANCE");
            System.out.println("Please tell us your name");
            name = sc.nextLine();
            System.out.println("---------------------------------------------------");
            System.out.println("OK \t" + name + "\tAnswer us yours acadamic Marks as asked below");
            System.out.println("MARKS SCORED IN SCIENCE");
            Science = sc.nextInt();
            System.out.println("MARKS SCORED IN MATHS");
            Maths = sc.nextInt();
            System.out.println("MARKS SCORED IN SOCIALSTUDIES");
            Socialstudies = sc.nextInt();
            System.out.println("MARKS SCORED IN ENGLISH");
            English = sc.nextInt();
            System.out.println("MARKS SCORED IN HINDI");
            Hindi = sc.nextInt();
            int R1 = Science + Maths + English;
            int R2 = Socialstudies + Maths + English;
            int R3 = Hindi + Maths + English;
            if (R1 >= R2 && R1 >= R3) {

                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Science\n" +
                        "We Suggest you to go for Science after 10th");

            } else if (R2 >= R1 && R2 >= R3) {

                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Mathematics\n" +
                        "We Suggest you to go for Commerce after 10th");

            } else {
                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Arts\n" +
                        "We Suggest you to go for Arts after 10th");
            }


            Scanner dc = new Scanner(System.in);
            String coms = "commerce";
            String sci = "science";
            String art = "arts";

            System.out.println("choose your sub");
            String yourchoice = dc.nextLine();
            if (yourchoice.equalsIgnoreCase(coms)) {
                System.out.println();
                System.out.println("This are the best colleges for commerce");
                System.out.println("https://www.google.co.in/maps/search/jr+college+after+10th/@19.3442737,72.7744687,12z/data=!3m1!4b1");
            } else if (yourchoice.equalsIgnoreCase(art)) {
                System.out.println();
                System.out.println("This are the best colleges for arts");
                System.out.println("https://www.google.co.in/maps/search/jr+college+after+10th/@19.3442737,72.7744687,12z/data=!3m1!4b1");
            } else {
                System.out.println();
                System.out.println("This Are the best colleges for  science");
                System.out.println("https://www.google.co.in/maps/search/jr+college+after+10th/@19.3442737,72.7744687,12z/data=!3m1!4b1");
            }
        }else if (yourqual.equalsIgnoreCase(quali2)){
            String name;
            int Chemistry,Physics,Mathematics,Biology,Engissh,Computer_IT;
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------------");
            System.out.println("HELLO WELCOME TO CAREER GUIDANCE");
            System.out.println("Please tell us your name");
            name = sc.nextLine();
            System.out.println("---------------------------------------------------");
            System.out.println("OK \t" + name + "\tAnswer us yours acadamic Marks as asked below");
            System.out.println("MARKS SCORED IN Chemistry");
            Chemistry = sc.nextInt();
            System.out.println("MARKS SCORED IN MATHS");
            Mathematics = sc.nextInt();
            System.out.println("MARKS SCORED IN PHYSICS");
            Physics= sc.nextInt();
            System.out.println("MARKS SCORED IN ENGLISH");
            Engissh = sc.nextInt();
            System.out.println("MARKS SCORED IN Biology(Put 0 if Biology not Taken)");
            Biology = sc.nextInt();
            System.out.println("MARKS SCORED IN Computer(Put 0 if Computer not Taken)");
            Computer_IT = sc.nextInt();

            int r4= Physics+Chemistry+Mathematics+Engissh+Biology;
            int r5= Physics+Chemistry+Mathematics+Engissh+Computer_IT;
            if (Biology==0){
                System.out.println("You have not choosen Biology in your 12th \n" +
                        "So we reccommed you to go with Engineering \n" +
                        "This are the best colleges of engineering");
                System.out.println("Engineering colleges in Mumbai\t"+"https://www.google.co.in/maps/search/engineering+colleges+in+mumbai/@19.343926,72.6847651,11z/data=!3m1!4b1");
                System.out.println("Engineering colleges in Pune\t"+"https://www.google.co.in/maps/search/engineering+colleges+in+pune/@18.4980587,73.8056709,12z/data=!3m1!4b1");
            }else{
                System.out.println("You have choosed Biology in your 12th Science and you can go for medical\n"+
                "This are the best colleges for mecical cources");
                System.out.println("https://www.google.co.in/maps/search/Medical+colleges+/@18.4986584,73.8056706,12z/data=!3m1!4b1");
            }


        }else if (yourqual.equalsIgnoreCase(quali3)){
            Commerce c = new Commerce();
            c.whatisCommerce();
            c.forwhowCommerceis();

        }else {
            AfterArt q=new AfterArt();
            q.careerAfter12arts();
        }


    }

    public static void personalinfo() {  System.out.println();
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

    static void welcome(){
        System.out.println();
        System.out.println();
        System.out.println(" As education systems are diversifying and expanding, the creation of new jobs and opportunities are changing the way individuals make their career choices.\n" +
                "With such changes in place, career planning has become more complex and confusing.\n" +
                "Where formal sources of career guidance are not easily accessible, individuals tend to rely on their family and friends, leading to choices where they end up in careers they do not see a successful future in.\n" +
                "So, we are introducing a system where you get the information about the field you want to have a career in.\n ");
    }
    static void intro(){
        System.out.println();
        System.out.println("   According to CBSE, nearly 32 lakhs of students appeared for 10th board exams. That’s a huge" +
                "number." + "But how many students are actually aware of what to do after 10th? Career counselling and" +
                "career guidance" + "for 10th class is the need of the hour." + " Students who are confused about their" +
                "stream selection" + "can go for career counselling. Career counselling for 10th class students is" +
                "extremely important as" + "today’s youth are tomorrow’s future." + "\n" +
                "“Padhega India tabhi toh badhega India.” ");
        System.out.println();
        System.out.println("& here We are for your Help to find the best career path.... ");
    }

    static void work(){
        System.out.println();
        System.out.println("  Why you need career counsellor??");
        System.out.println("  A lot of options but choosing the right career is very crucial." +
                "Career counselling with a trained career counsellor can help you solve your confusion." +
                "A career counsellor uses career assessment to derive a perfect career path for your future." +
                "Career assessment test analyses your skills, interest, abilities and based on that a clear roadmap" +
                "is provided."
        );
    }




    }


    class arts extends Arts {
        @Override
        public void whatisArts() {
            super.whatisArts();
        }
    }

    class science extends Science {
        @Override
        public void WhatisScience() {
            super.WhatisScience();
        }
    }
    class commerce extends Commerce {
        @Override
        public void whatisCommerce() {
            super.whatisCommerce();
        }
    }

    class engineering extends Engineering{
        @Override
        public void Whatisengineering(){super.Whatisengineering();}
    }
    class medical extends Medical{
        @Override
        public void WhatisMedical(){super.WhatisMedical();}
    }
    class aftercom extends AFterCOM{
        @Override
        public void careeraftercom(){super.careeraftercom();}
    }
   class afterart extends AfterArt{
        @Override
        public void careerAfter12arts(){super.careerAfter12arts();}
    }






