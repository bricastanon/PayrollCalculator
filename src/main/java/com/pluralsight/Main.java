package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Video movie1 = new Video("Interstellar");
        movie1.LikeVideo();


        System.out.println("Hello world!");


        // Declare the variable
        String firstname;
        float hoursWorked;
        float payRate;
        float grosspay;

        Scanner scanner = new Scanner(System.in);

        // Asking for input
        System.out.println("What is your first name? ");
        firstname = scanner.nextLine();

        System.out.println("What is your pay rate? ");
        payRate = scanner.nextFloat();

        System.out.println("What is your hours worked? ");
        hoursWorked = scanner.nextFloat();

        // Doing the calculation (algorithm)
        // Grosspay = hours * payrate
        grosspay = hoursWorked * payRate;
        System.out.println(firstname + " earned $ " + grosspay);


        // ---------------------------------------------------------------------------
        // MAKING A METHOD
     /*   sayHi("Bri", 25);

    }

    public static void sayHi(String name, int age) {
        System.out.println("Hi " + name + " are you really " + age + " years old?");
    }

// ANOTHER EXAMPLE METHOD:
        // Create a methods with the name LikedThe Video
        // Add a parameter with video title
        // output "this person liked the movie" interstellar
        // LikeThe Video("Interstellar")ew
        LikedTheVideo("Brianna", "Interstellar");
    }
    public static void LikedTheVideo(String who, String videotitle) {
        System.out.println( who + " likes the movie " + videotitle);
    }



// IDK WHAT JUST HAPPENED HERE
    // ANOTHER METHOD
  /*  String storeTheReturnedTile = LikedTheVideo("Interstellar");
}
public static String LikedTheVideo(String videotitle) {
    System.out.println("This person likes the movie " + videotitle);
    return videotitle;
}
*/
    }
}
