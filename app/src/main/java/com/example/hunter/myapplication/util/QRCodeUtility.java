package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */

public class QRCodeUtility {
    public static int sqrt(int val) {
        int temp, g=0, b = 0x8000, bshft = 15;
        do {
            if (val >= (temp = (((g << 1) + b)<<bshft--))) {
                g += b;
                val -= temp;
            }
        } while ((b >>= 1) > 0);

        return g;
    }

}