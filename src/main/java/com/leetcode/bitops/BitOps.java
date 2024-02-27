package com.leetcode.bitops;

import java.math.BigInteger;

public class BitOps {
    public static int getBit(int n, int pos){
        var bitMask = 1 << pos;
        var temp = bitMask & n;
        if(temp == 0) {
            return 0;
        } else {
            return 1;
        }

    }
    public static int setBit(int n , int pos){
        var bitMask = 1 << pos;
        var temp = bitMask | n;
        return temp;
    }
    public static int clearBit(int n, int pos){
        var bitMask = 1 << pos;
        var notBitMask = ~bitMask;
        return notBitMask & n;
    }
}
