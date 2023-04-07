// Aisha Nicole L. Dones
// Section A122

import java.util.Random;

public class ExtraChallenge {
    
    public static void main(String[] args){

        final String[] prize ={"Cellphone with projector"," Washing Machine with ironing",
                "House and Lot with lot and house", "Trip to Afghanistan for 2", "Summer Vacation at Sahara desert",
                "LED TV without TV", "Ferrari with dining room", "1 year supply of baygon katol",
                "1-day long boxing practice with Bradley and Pacquiao", "A kiss from Mommy Dionisia",
                "Lifetime Driver of Delima", "Unlimited family vacation package to Syria"};

        Random randomGenerator = new Random();

        System.out.println("-- RAFFLE GAME --");
        System.out.println("Created by: Aisha Nicole L. Dones\n");

        System.out.println("Generating prizes for each of the 3 persons...");
        for (int idx = 1; idx <= 3; ++idx){
            int randomInt = randomGenerator.nextInt(prize.length);
            System.out.println("Prize for person " + idx + ": " + prize[randomInt]);
        }
        System.out.print("Done.");

    } // end of main

} // end of class
