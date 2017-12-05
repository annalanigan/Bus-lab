import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBus {

    Bus myBus;
    Bus myBus2;
    Person person1;
    Person person2;


    @Before
    public void before () {
        myBus = new Bus("Ocean Terminal", 35);
        myBus2 = new Bus("CodeClan", 1);
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, myBus.passengersCount());
    }

    @Test
    public void addPassenger(){
        myBus.addPassenger(person1);
        assertEquals(1, myBus.passengersCount());
    }

    @Test
    public void busFull() {
        myBus2.addPassenger(person1);
        myBus2.addPassenger(person2);
        assertEquals(1, myBus2.passengersCount());
    }

}
