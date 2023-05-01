package com.r;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CoffeeMachineTest {

    CoffeeMachine coffeemachine = new CoffeeMachine();

    @Test
    public void test0() {
        assertTrue(coffeemachine.x<5 && coffeemachine.y<5 && coffeemachine.g<5 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
        coffeemachine.wait(4);
        assertTrue(coffeemachine.x<5 && coffeemachine.y<5 && coffeemachine.g<5 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
//L1
        coffeemachine.button();
        assertTrue(coffeemachine.button && !coffeemachine.grinding && !coffeemachine.brewing && !coffeemachine.coffee);
        assertTrue(coffeemachine.x>3 && coffeemachine.y>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
        coffeemachine.wait(0);
        assertTrue(coffeemachine.x>3 && coffeemachine.y>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
//L2
        assertTrue(coffeemachine.button && coffeemachine.grinding && !coffeemachine.brewing && !coffeemachine.coffee);
        coffeemachine.y = 0;
        assertTrue(coffeemachine.x>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
        coffeemachine.wait(5);
        assertTrue(coffeemachine.x>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
//L3
        assertTrue(coffeemachine.button && coffeemachine.grinding && coffeemachine.brewing && !coffeemachine.coffee);
        assertTrue(coffeemachine.x>8 && coffeemachine.x<15 && coffeemachine.y<=5 && coffeemachine.g>8 && coffeemachine.g<15 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
        coffeemachine.wait(0);
        assertTrue(coffeemachine.x>8 && coffeemachine.x<15 && coffeemachine.y<=5 && coffeemachine.g>8 && coffeemachine.g<15 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
//L4
        assertTrue(coffeemachine.button && coffeemachine.grinding && coffeemachine.brewing && coffeemachine.coffee);
        assertTrue(coffeemachine.x>8 && coffeemachine.y>=5 && coffeemachine.g>8 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
    }
    @Test
    public void test1() {
        assertTrue(coffeemachine.x<5 && coffeemachine.y<5 && coffeemachine.g<5 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
        coffeemachine.wait(4);
        assertTrue(coffeemachine.x<5 && coffeemachine.y<5 && coffeemachine.g<5 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
//L1
        coffeemachine.button();
        assertTrue(coffeemachine.button && !coffeemachine.grinding && !coffeemachine.brewing && !coffeemachine.coffee);
        assertTrue(coffeemachine.x>3 && coffeemachine.y>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
        coffeemachine.wait(0);
        assertTrue(coffeemachine.x>3 && coffeemachine.y>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<=0 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<=0 && coffeemachine.g-coffeemachine.y<=0 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<=0);
//L2
        assertTrue(coffeemachine.button && coffeemachine.grinding && !coffeemachine.brewing && !coffeemachine.coffee);
        coffeemachine.y = 0;
        assertTrue(coffeemachine.x>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
        coffeemachine.wait(5);
        assertTrue(coffeemachine.x>3 && coffeemachine.g>3 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
//L3
        assertTrue(coffeemachine.button && coffeemachine.grinding && coffeemachine.brewing && !coffeemachine.coffee);
        assertTrue(coffeemachine.x>8 && coffeemachine.x<15 && coffeemachine.y<=5 && coffeemachine.g>8 && coffeemachine.g<15 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
        coffeemachine.wait(0);
        assertTrue(coffeemachine.x>8 && coffeemachine.x<15 && coffeemachine.y<=5 && coffeemachine.g>8 && coffeemachine.g<15 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
//L4
        assertTrue(coffeemachine.button && coffeemachine.grinding && coffeemachine.brewing && coffeemachine.coffee);
        assertTrue(coffeemachine.x>8 && coffeemachine.y>=5 && coffeemachine.g>8 && coffeemachine.y-coffeemachine.x<-3 && coffeemachine.g-coffeemachine.x<=0 && coffeemachine.x-coffeemachine.y<10 && coffeemachine.g-coffeemachine.y<10 && coffeemachine.x-coffeemachine.g<=0 && coffeemachine.y-coffeemachine.g<-3);
    }


}
