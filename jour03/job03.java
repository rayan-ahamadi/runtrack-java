package jour03;

import java.util.Arrays;

public class job03 {
    public static void main(String[] args){
        String[] myStrings = new String[] {"Josette","John","Myrtille","Marc"};
        System.out.print(myStrings[1] + "\n" );
        myStrings[2] = "Mireille";
        System.out.print(Arrays.toString(myStrings) + "\n" );



    }

}
