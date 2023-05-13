package jour03;

import java.util.Arrays;
import java.util.Random;

public class job06 {
    public static void main(String[] args){
        Random random = new Random();
        int tab[] = new int[10];

        for(int i = 0; i < 10 ;i++){
            tab[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString((tab)));

    }

}
