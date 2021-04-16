package Array;

import java.util.Scanner;

public class Kendaraan {
    public static void Array(String[] args) {
        String[] strArray = new String[] { "Praxis", "String", "java", "Backend", "lmao" };
        System.out.println("Kalimat : Praxis , String , java, Backend , lmao ");
        int length = strArray.length;
        System.out.println("jumlah kalimat : " + length);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
