package com.ct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CTBva {
    CoffeeTeaMachine cof = new CoffeeTeaMachine();
    @Test
    public void test0() {
//L0 Enter
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.wait(5);
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Exit
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
//L0 Enter
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.wait(4);
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Exit
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
//L2 Enter
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.wait(9);
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Exit
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
//L5 Enter
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
    }
    @Test
    public void test1() {
//L0 Enter
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.wait(4);
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Exit
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
//L3 Enter
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        cof.wait(4);
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Exit
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
//L4 Enter
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        cof.wait(10);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Exit
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
//L0 Enter
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.wait(4);
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Exit
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
//L2 Enter
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.wait(9);
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Exit
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
//L5 Enter
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
    }
    @Test
    public void test2() {
//L0 Enter
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.wait(4);
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Exit
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
//L2 Enter
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
        cof.wait(9);
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
//L2 Exit
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
//L5 Enter
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
        cof.wait(12);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
//L5 Exit
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
//L0 Enter
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
        cof.wait(20);
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
//L0 Exit
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
//L1 Enter
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
        cof.wait(5);
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
//L1 Exit
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
//L0 Enter
        assertTrue(cof.x>=5 && cof.g>=15 && cof.x-cof.g<=-10);
    }
    @Test
    public void test3() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test4() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test5() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test6() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test7() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test8() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test9() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test10() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test11() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test12() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test13() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test14() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test15() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test16() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test17() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test18() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test19() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test20() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test21() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test22() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test23() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.tea();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && cof.tea);
        cof.x = 0;
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
//L3 Enter
        cof.wait(4);
//L3 Exit
        assertTrue(cof.x<5 && cof.x-cof.g<=0);
        assertTrue(cof.coin && !cof.pouringCoffee && cof.pouringTea && !cof.coffee && cof.tea);
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
//L4 Enter
        cof.wait(10);
//L4 Exit
        assertTrue(cof.x>=3 && cof.x<=10 && cof.g>=3 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=5 && cof.g>=5 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=5 && cof.x-cof.g<=-5);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.g>=5 && cof.x-cof.g<=-5);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=11 && cof.x-cof.g<=-5);
//L5 Enter
    }
    //BVA Variant
    @Test
    public void test24() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
//L5 Enter
        cof.wait(12);
//L5 Exit
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=15 && cof.x-cof.g<=-10);
//L0 Enter
    }
    //BVA Variant
    @Test
    public void test25() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
//L5 Enter
        cof.wait(12);
//L5 Exit
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=15 && cof.x-cof.g<=-10);
//L0 Enter
    }
    //BVA Variant
    @Test
    public void test26() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
//L5 Enter
        cof.wait(12);
//L5 Exit
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=15 && cof.x-cof.g<=-10);
//L0 Enter
    }
    //BVA Variant
    @Test
    public void test27() {
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.g-cof.x<=0 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
//L1 Enter
        cof.wait(4);
//L1 Exit
        assertTrue(cof.x<=5 && cof.x-cof.g<=0);
        cof.coffee();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
//L2 Enter
        cof.wait(9);
//L2 Exit
        assertTrue(cof.x<10 && cof.x-cof.g<=0);
        assertTrue(cof.coin && cof.pouringCoffee && !cof.pouringTea && cof.coffee && !cof.tea);
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
//L5 Enter
        cof.wait(12);
//L5 Exit
        assertTrue(cof.x>=6 && cof.x<=12 && cof.g>=6 && cof.x-cof.g<=0);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
//L0 Enter
        cof.wait(20);
//L0 Exit
        assertTrue(cof.x>=10 && cof.g>=10 && cof.x-cof.g<=0);
        cof.coin();
        assertTrue(cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        cof.x = 0;
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
//L1 Enter
        cof.wait(5);
//L1 Exit
        assertTrue(cof.x<=5 && cof.g>=10 && cof.x-cof.g<=-10);
        assertTrue(!cof.coin && !cof.pouringCoffee && !cof.pouringTea && !cof.coffee && !cof.tea);
        assertTrue(cof.x>=5 && cof.g>=15 && cof.x-cof.g<=-10);
//L0 Enter
    }
//BVA Variant

}
