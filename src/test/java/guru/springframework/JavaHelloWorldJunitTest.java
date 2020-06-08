package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldJunitTest {

    @Test
    public void testGetHello() {
        JavaHelloWorld world = new JavaHelloWorld();
        assertEquals(world.getHello(), "Hello World");

    }

    @Test
    public void testGetHello2() {
        JavaHelloWorld world = new JavaHelloWorld();
        assertEquals(world.getHello(), "Hello World");

    }

    @Test
    public void testGetHello3() {
        JavaHelloWorld world = new JavaHelloWorld();
        assertEquals(world.getHello(), "Hello World");

    }
}