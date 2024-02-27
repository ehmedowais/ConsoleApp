package com.leetcode.bitops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitOpsTest {
    @Test
    public void getBitTest(){
        assertEquals(1, BitOps.getBit(5, 2));
    }

    @Test
    public void setBitTest() {
        assertEquals(7, BitOps.setBit(5, 1));
    }
    @Test
    public void setClearBit() {
        assertEquals(1, BitOps.clearBit(5,2));
    }
}