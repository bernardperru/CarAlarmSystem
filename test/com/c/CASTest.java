package com.c;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CASTest {

    public CAS cas = new CAS();


    @Test
    public void test0() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test1() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test2() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test3() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test4() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test5() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(21);
        assertFalse(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertFalse(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test6() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test7() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test8() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test9() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test10() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(270);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.close();
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test11() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test12() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(270);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.close();
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assertTrue(cas.c>20 && cas.g>=320 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-320);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test13() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(270);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.d<=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.close();
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=320 && cas.d>=300 && cas.g>=320 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.d>=300 && cas.g>=320 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.d>=300 && cas.g>=320 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d>=320 && cas.g>=340 && cas.c-cas.d<=-300 && cas.c-cas.g<=-320 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test14() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
    }
    @Test
    public void test15() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
    }

    //failing test maybe
    @Test
    public void test16() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertFalse(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
    }

    //failing test maybe
    @Test
    public void test17() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(31);
        assertFalse(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertFalse(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
    }

    //failing test maybe
    @Test
    public void test18() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(30);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=50 && cas.d>=30 && cas.d<=300 && cas.g>=50 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        assertTrue(cas.c>20 && cas.g>=50 && cas.d-cas.c<-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-50);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test19() {
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.close();
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.lock();
        cas.c = 0;
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.open();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d<=30 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        cas.unlock();
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && cas.flash);
    }

}
