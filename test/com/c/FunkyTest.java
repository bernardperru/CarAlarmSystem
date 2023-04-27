package com.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunkyTest {

    CAS cas = new CAS();

    @Test
    public void test29() {
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
        assertTrue(cas.d-cas.c<=0 && cas.g-cas.c<=0 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(20);
        assertTrue(cas.c<=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L4
        assertTrue(cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.c<=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(0);
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
//L6
        cas.unlock();
        assertTrue(!cas.locked && cas.armed && cas.closed && !cas.sound && !cas.flash);
        cas.d = 0;
        assertTrue(cas.c>=20 && cas.d>=20 && cas.g>=20 && cas.c-cas.d<=0 && cas.g-cas.d<=0 && cas.c-cas.g<=0 && cas.d-cas.g<=0);
        cas.wait(1);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
//L1
        assertTrue(!cas.locked && !cas.armed && cas.closed && !cas.sound && !cas.flash);
        assertTrue(cas.c>=20 && cas.g>=20 && cas.d-cas.c<=-20 && cas.c-cas.g<=0 && cas.d-cas.g<=-20);
    }
//
}

//what defines a failing test?
//this case attempts to delay for 1 second in L6 --> triggers output at 0 and delays for 1 second in L1