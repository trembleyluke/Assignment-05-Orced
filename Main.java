import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int INT = 10;
        int str = rand.nextInt(31-INT);
        int str2 = str + 10;
        int agi = 30-str-INT;
        int agi2 = agi + 10;

        System.out.println("Strength = " + str2);
        System.out.println("Dexterity = " + agi2);
        System.out.println("Intelligence = " + INT);

        double damage = (double)INT * 10;
        double mod = rand.nextDouble()+ 0.5;
        double turn1 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn2 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn3 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn4 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn5 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn6 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn7 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn8 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn9 = damage * mod;
        mod = rand.nextDouble()+ 0.5;
        double turn10 = damage * mod;

        double finalHp = 1000-turn1-turn2-turn3-turn4-turn5-turn6-turn7-turn8-turn9-turn10;
        System.out.print("The boss's final HP is "+ finalHp);
    }
}
