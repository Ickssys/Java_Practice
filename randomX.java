import java.util.*;

public class randomX {
    public static void main(String[] args) {
        randomXLine();
    }    
    public static void randomXLine() {
        Random r = new Random();
        int num; 
        do {
            num = r.nextInt(15) + 5;
            for (int i = 0; i < num; i++) {
                System.out.print("x");
            }
            System.out.println();
        } while (num < 16);
    }
}
