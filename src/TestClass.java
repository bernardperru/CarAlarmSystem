import org.junit.Before;
import org.junit.Test;


public class TestClass {

    public CAS cas = new CAS();

    @Test
    public void test0() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test1() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test2() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.unlock();
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test3() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.unlock();
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test4() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.unlock();
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test5() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(3);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.unlock();
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }

    //failing test maybe
    @Test
    public void test6() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test7() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.unlock();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test8() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test9() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test10() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(3);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(27);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.close();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test11() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test12() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(3);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(27);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.close();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=32 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-32);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test13() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(3);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(27);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.d<=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.unlock();
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=32 &&  cas.d>=30 &&  cas.g>=32 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.d>=30 &&  cas.g>=32 &&  cas.c- cas.d<=-30 &&  cas.c- cas.g<=-32 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.d>=30 &&  cas.g>=32 &&  cas.c- cas.d<=-30 &&  cas.c- cas.g<=-32 &&  cas.d- cas.g<=-2);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=32 &&  cas.g>=34 &&  cas.c- cas.d<=-30 &&  cas.c- cas.g<=-32 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }
    @Test
    public void test14() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(3);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
    }
    @Test
    public void test15() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(3);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
    }

    //failing test maybe
    @Test
    public void test16() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(3);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(27);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
    }

    //failing test maybe
    @Test
    public void test17() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(2);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(3);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        cas.wait(28);
        assert(  cas.c>=5 &&  cas.d>=3 &&  cas.d<=30 &&  cas.g>=5 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        cas.wait(0);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
        assert(  cas.c>2 &&  cas.g>=5 &&  cas.d- cas.c<-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-5);
    }

    //failing test maybe
    @Test
    public void test18() {
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.close();
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && !cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.lock();
        cas.c = 0;
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(2);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0);
        cas.wait(0);
        cas.open();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.d<=3 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        cas.unlock();
        cas.d = 0;
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && !cas.locked && !cas.closed && cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && cas.flash);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        cas.wait(0);
        assert(  cas.c>=2 &&  cas.g>=2 &&  cas.d- cas.c<=-2 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=-2);
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
    }

}
