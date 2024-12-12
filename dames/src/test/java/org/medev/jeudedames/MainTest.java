package org.medev.jeudedames;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Call the main method
            Main.main(new String[]{});

            // Assert the expected output
            assertEquals("Hello world!\n", outContent.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }
}
