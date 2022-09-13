import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float quantityBTC, haveDollars, rateBTCtoDollars;

        rateBTCtoDollars = isCorectNumber("What is Bitcoin price today?");
        haveDollars = isCorectNumber("How much $ do you have?");

        quantityBTC = haveDollars / rateBTCtoDollars;
        System.out.println("You can buy " + quantityBTC + " BTC");
    }

    public static float isCorectNumber (String text) {
        float variable;
        System.out.println(text);
        do {
            /*System.out.println("It must be number, not '0' or nothing. Try again");*/
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextFloat()) {
                    variable = sc.nextFloat();
                } else {
                    System.out.println("It must be a number. Try again.");
                    variable = 0;
                }
            if (variable <=0) {
                System.out.println("It must be a number greater than 0, not negative. Try again.");
            }
            } while (variable <= 0);
        return variable;
    }
}