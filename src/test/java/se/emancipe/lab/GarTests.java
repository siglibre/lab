package se.emancipe.lab;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;

import org.junit.jupiter.api.*;

import picocli.CommandLine;

class GarTests {
    private CommandLine cmd = new picocli.CommandLine(new Gar());

    @Test
    void helpUsage() {
        var outStringWriter = new java.io.StringWriter();
        cmd.setOut(new PrintWriter(outStringWriter));
        var exitCode = cmd.execute("--help");

        assertNotEquals("", outStringWriter.toString());
        assertEquals(exitCode, 0);
    }
}
