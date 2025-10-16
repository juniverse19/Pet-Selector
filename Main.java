// Ryan Kim
// 10/16/2025
// This program determines the perfect pet for the user based on their inputs of favorite color & season and their name

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, blue, green)");
        String favColor = scan.nextLine();
        favColor = favColor.toLowerCase();
        if (!(favColor.equals("red")) && !(favColor.equals("green")) && !(favColor.equals("blue"))) {
            System.out.println("Input was not in the options. Your favorite color is now set to red");
            favColor = "red";
        }

        System.out.println("Enter your favorite season (spring, summer, fall, winter)");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if (!(favSeason.equals("spring")) && !(favSeason.equals("summer")) && !(favSeason.equals("fall")) && !(favSeason.equals("winter"))) {
            System.out.println("Input was not in the options. Your favorite season is now set to spring");
            favSeason = "spring";
        }
        
        System.out.println("Enter your name");
        String name = scan.nextLine();

        boolean isConsonant = ("qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM".indexOf(name.charAt(0)) != -1);
    
        scan.close();

        //Determines perfect pet
        String pet = "Placeholder";
        if (favColor.equals("blue")){
            if (favSeason.equals("fall")){
                pet = "alligator";
            }
            if (favSeason.equals("spring")){
                pet = "ostrich";
            }

        } else if (favColor.equals("green")){
            if (((isConsonant)) && (favSeason.equals("winter"))) {
                pet = "giraffe";
            }
            if ((!(favSeason.equals("fall"))) && (!(pet.equals("giraffe")))){
                pet = "dog";
            }
        } else {
            if (!isConsonant){
                pet = "porcupine";
            } else {
                pet = "panda";
            }
        }

        if (favSeason.equals("summer") && pet.equals("Placeholder")) {
            pet = "pony";
        }

        if (((isConsonant)) && (favColor.equals("blue")) && ((!(favSeason.equals("summer"))) && (!(favSeason.equals("fall")))) && (pet.equals("Placeholder"))) {
            pet = "axolotl";
        }

        if (pet.equals("Placeholder")){
            pet = "rock";
        }

        System.out.println("Your perfect pet is a " + pet);

    }
}
