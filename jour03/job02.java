package jour03;

import java.util.Arrays;

public class job02 {
    public static void main(String[] args){
        int[] monTableau = new int[] {12,6,76,89};
        System.out.print(Arrays.toString(monTableau) + "\n" );
        monTableau[1] = 10;
        monTableau[3] = 13;
        System.out.print(Arrays.toString(monTableau));

    }

}
