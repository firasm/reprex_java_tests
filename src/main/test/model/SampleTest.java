package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    private Sample testSample;

    @BeforeEach
    void testAddSeed(){
        
        testSample = new Sample("testSample");
    }

    @Test
    void testAddOne(){
        testSample.addSeed();
        assertEquals(1,testSample.getSeedNum());
    }

    @Test
    void testMany(){
        testSample.addSeed();
        testSample.addSeed();
        testSample.addSeed();
        assertEquals(3,testSample.getSeedNum());
    }
}