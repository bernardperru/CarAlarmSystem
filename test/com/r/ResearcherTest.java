package com.r;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ResearcherTest {

    Researcher researcher = new Researcher();

    @Test
    public void test0() {
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(0);
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        researcher.cof();
        researcher.x = 0;
        assertTrue(researcher.x<=4 && researcher.x-researcher.g<=0);
        assertTrue(researcher.cof && !researcher.tea);
        researcher.wait(4);
        assertTrue(researcher.x<=4 && researcher.x-researcher.g<=0);
        researcher.x = 0;
        assertTrue(researcher.g>=2 && researcher.x-researcher.g<=-2);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
    }
    @Test
    public void test1() {
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(0);
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        researcher.tea();
        researcher.x = 0;
        assertTrue(researcher.x<=8 && researcher.g<=23 && researcher.g-researcher.x<=15 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && researcher.tea);
        researcher.wait(8);
        assertTrue(researcher.x<=8 && researcher.g<=23 && researcher.g-researcher.x<=15 && researcher.x-researcher.g<=0);
        researcher.x = 0;
        assertTrue(researcher.g>=4 && researcher.g-researcher.x<=23 && researcher.x-researcher.g<=-4);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
    }
    @Test
    public void test2() {
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(0);
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        researcher.cof();
        researcher.x = 0;
        assertTrue(researcher.x<=4 && researcher.x-researcher.g<=0);
        assertTrue(researcher.cof && !researcher.tea);
        researcher.wait(4);
        assertTrue(researcher.x<=4 && researcher.x-researcher.g<=0);
        researcher.x = 0;
        assertTrue(researcher.g>=2 && researcher.x-researcher.g<=-2);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
    }
    @Test
    public void test3() {
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(0);
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        researcher.tea();
        researcher.x = 0;
        assertTrue(researcher.x<=8 && researcher.g<=23 && researcher.g-researcher.x<=15 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && researcher.tea);
        researcher.wait(8);
        assertTrue(researcher.x<=8 && researcher.g<=23 && researcher.g-researcher.x<=15 && researcher.x-researcher.g<=0);
        researcher.x = 0;
        assertTrue(researcher.g>=4 && researcher.g-researcher.x<=23 && researcher.x-researcher.g<=-4);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(0);
        assertTrue(researcher.g>=4 && researcher.g-researcher.x<=23 && researcher.x-researcher.g<=-4);
        researcher.cof();
        researcher.x = 0;
        assertTrue(researcher.x<=4 && researcher.g>=4 && researcher.x-researcher.g<=-4);
        assertTrue(researcher.cof && !researcher.tea);
        researcher.wait(4);
        assertTrue(researcher.x<=4 && researcher.g>=4 && researcher.x-researcher.g<=-4);
        researcher.x = 0;
        assertTrue(researcher.g>=6 && researcher.x-researcher.g<=-6);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
    }
    @Test
    public void test4() {
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(!researcher.cof && !researcher.tea && researcher.current == researcher.old + 1);
        researcher.wait(16);
        assertTrue(researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        researcher.tea();
        assertTrue(researcher.x>15 && researcher.g>15 && researcher.g-researcher.x<=0 && researcher.x-researcher.g<=0);
        assertTrue(researcher.tea);
    }


}
