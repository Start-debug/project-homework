import java.lang.Math;

public class Taxi {
    public static void main(String[] args) {
        System.out.println("====================================================");
        for (int i = 5; i <= 20; i = i + 5) {
            System.out.println("Long of this journey:" + i + "km");
            System.out.println("Start driving...");
            double fee = 0D;
            if (i > 3 & i <= 6) {
                fee = 2.2 * (i - 3) + 12;
            } else if (i > 6 & i <= 20) {
                fee = 2.2 * (i - 3) + 12 + 0.5 * 2.2 * (i - 6);
            }
            for (int j = 1; j <= i; j++) {
                if ((int) Math.random() % 5 == 0) {
                    System.out.println("Ahhhhh!");
                    int flag = (int) (Math.random() * 100000) % 15;
                    System.out.println("You drive in low speed for " + flag + " km");
                    if (flag <= 5)
                        fee = fee + flag * 0.4;
                    else {
                        fee = fee + (flag - 5) * 0.5 + 2;
                    
                    }
                }
                if ((int) Math.random() % 7 == 0) {
                    System.out.println("Go on the highway...");
                    System.out.println("You spend " + (int)(Math.random()*1000000)%50 + " yuan.");
                }
            }
            System.out.println("You spend " + (float)Math.round(fee*100)/100 + " yuan for the journey.");
            System.out.println("====================================================");
        }
    }
}