import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int max = 9;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        System.out.println(rand);
        if(rand == 1) {
            System.out.println("Hello world!");
        }
    }
}