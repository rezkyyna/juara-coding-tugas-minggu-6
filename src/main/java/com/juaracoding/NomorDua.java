package com.juaracoding;

public class NomorDua {
    public static void main(String[] args) {
        // Cetak 1_3_5_7_9
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i);
            if (i < 9) {
                System.out.print("_");
            }
        }
        System.out.println();

        // Cetak _3_5_7_
        for (int i = 3; i <= 7; i += 2) {
            System.out.print("_" + i);
        }
        System.out.print("_");
        System.out.println("");

        //cetak 3_5_7
        for (int i = 3; i <= 7; i += 2) {
            System.out.print(i);
            if (i != 7) {
                System.out.print("_");
            }
        }

        //mencetak _5_ dan 5
        System.out.println("");
        for (int j = 1; j <= 2; j++) {
            if (j == 1) {
                System.out.print("_5_");
                System.out.println("");
            } else {
                System.out.print("5");
            }
        }
    }
}




