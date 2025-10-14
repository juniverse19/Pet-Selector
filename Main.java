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
    






        scan.close();
    }
}
