package com.ct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CTNoBva {

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

}
