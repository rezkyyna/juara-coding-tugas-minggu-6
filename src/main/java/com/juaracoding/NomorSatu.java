package com.juaracoding;

public class NomorSatu {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println("BIZZ");
                } else if (i % 5 == 0) {
                    System.out.println("BUZZ");
                } else {
                    System.out.println("BIZZBUZZ");
                }
            }
        }
    }

