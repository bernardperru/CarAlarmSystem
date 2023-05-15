package com.bva;

import com.c.CAS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExtendNoBva {
    CAS cas = new CAS();


    @Test
    public void test0() {
        long start, end;
        start = System.nanoTime();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        end = System.nanoTime();
        System.out.println(end - start);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L2
        cas.lock();
        start = System.nanoTime();
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        end = System.nanoTime();
        System.out.println(end-start);
        start = System.nanoTime();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        end = System.nanoTime();
        System.out.println(end-start);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.close();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test1() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L2
        cas.lock();
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.close();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test2() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.unlock();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test3() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L2
        cas.open();
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.close();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test4() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L2
        cas.lock();
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L0
        cas.unlock();
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test5() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L0
        cas.open();
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
    }
    @Test
    public void test6() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L8
        cas.open();
        assertTrue(cas.locked && cas.armed && !cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L9
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L15
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L10
        assertTrue(cas.locked && !cas.armed && !cas.closed && cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L12
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(270);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L7
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L5
        cas.close();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
//L6
        cas.unlock();
        assertTrue(!cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
//L1
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
    }
    @Test
    public void test7() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L6
        cas.unlock();
        assertTrue(!cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L1
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=40 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
    }
    @Test
    public void test8() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L8
        cas.open();
        assertTrue(cas.locked && cas.armed && !cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L9
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L15
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L10
        assertTrue(cas.locked && !cas.armed && !cas.closed && cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L12
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(270);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L7
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L0
        cas.unlock();
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.d>=300 && cas.g>=320 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.d>=300 && cas.g>=320 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=320 && cas.g>=340 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
    }
    @Test
    public void test9() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L8
        cas.open();
        assertTrue(cas.locked && cas.armed && !cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L9
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L15
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L10
        assertTrue(cas.locked && !cas.armed && !cas.closed && cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L12
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L11
        cas.unlock();
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
//L14
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
    }
    @Test
    public void test10() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L8
        cas.open();
        assertTrue(cas.locked && cas.armed && !cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L9
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L15
        assertTrue(cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L10
        assertTrue(cas.locked && !cas.armed && !cas.closed && cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L11
        cas.unlock();
        assertTrue(!cas.locked && !cas.armed && !cas.closed && cas.sound && cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L14
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L0
        assertTrue(!cas.locked && !cas.armed && !cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L1
        cas.close();
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L3
        cas.lock();
        assertTrue(cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=40 && cas.c-cas.d<=0 && cas.c-cas.g<=-20 && cas.d-cas.g<=-20);
    }

}
