package Java44;

import java.util.Arrays;
import java.util.Random;

public class java44 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] dizi = new int[8];
        int[] subdizi = new int[8];
        int count=0;
        for(int i=0; i<dizi.length; i++){
            dizi[i] = rand.nextInt(1, 15);
        }
        System.out.println(Arrays.toString(dizi));
        for(int i=0; i<dizi.length; i++){
            for(int j=0; j<dizi.length; j++){
                if(dizi[i] == dizi[j]) {subdizi[i] = dizi[i]; count++;}
            }
            if (count == 1) subdizi[i] = 0;
            count =0;
        }
        Arrays.sort(subdizi);

        int subcount=0;
        for(int i=0; i<subdizi.length; i++){
            if(subdizi[i] != 0) subcount++;
        }

        int[] subbestdizi = new int[subcount];
        int number = subdizi.length - subcount;
        subbestdizi = Arrays.copyOfRange(subdizi, number, subdizi.length);
        System.out.println(Arrays.toString(subbestdizi));
    }
}
