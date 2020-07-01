package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void testException() {
        // throwExceptionForSomething();
        Assertions.assertThrows(RuntimeException.class, this::throwExceptionForSomething);
    }

    public void throwExceptionForSomething() {
        throw new RuntimeException("Exception is thrown");
    }

}
