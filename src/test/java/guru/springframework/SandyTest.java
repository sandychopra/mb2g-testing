package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SandyTest {

    @Test
    public void testGetHello6() {
        JavaHelloWorld world = new JavaHelloWorld();
        assertEquals(world.getHello(), "Hello World");

    }
}
