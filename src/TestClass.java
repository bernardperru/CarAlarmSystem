import org.junit.Before;
import org.junit.Test;


public class TestClass {

    public CAS cas = new CAS();


    @Test
    public void test() {

        assert(( cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        assert(!cas.armed && !cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert(( cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        cas.lock();
        assert((cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        assert(!cas.armed && cas.locked && !cas.closed && !cas.sound && !cas.flash);
        assert((cas.d- cas.c<=0 &&  cas.g- cas.c<=0 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        cas.close();
        cas.c = 0;
        assert((cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        assert(!cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
        assert((cas.c<=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        cas.wait(2);
        assert((cas.c>=2 &&  cas.d>=2 &&  cas.g>=2 &&  cas.c- cas.d<=0 &&  cas.g- cas.d<=0 &&  cas.c- cas.g<=0 &&  cas.d- cas.g<=0));
        assert(cas.armed && cas.locked && cas.closed && !cas.sound && !cas.flash);
    }




}
