package guru.springframework;

import org.junit.Test;

public class JavaHelloWorldTest {

    @Test
    public void testGetHelloWorld() {

        JavaHelloWorld world = new JavaHelloWorld();
        assert(world.getHello().equals("Hello World"));
    }

}