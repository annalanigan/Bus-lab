import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBus {

    Bus myBus;
    Person person1;
    Person person2;


    @Before
    public void before () {
        myBus = new Bus("Ocean Terminal", 35);
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, myBus.passengersCount());
    }

}
