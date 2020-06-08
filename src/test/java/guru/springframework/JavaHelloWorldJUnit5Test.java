package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldJUnit5Test {

    @Test
    public void testGetHelloJUnit5() {

        JavaHelloWorld world = new JavaHelloWorld();
        assertEquals(world.getHello(), "Hello World");
    }
}