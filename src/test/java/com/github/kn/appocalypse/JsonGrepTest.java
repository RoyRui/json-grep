package com.github.kn.appocalypse;

import org.junit.Test;

import com.github.kn.appocalypse.JsonGrep;

import java.io.ByteArrayInputStream;

public class JsonGrepTest {
    @Test
    public void testRoot() {
        setSystemIn("[]");

        JsonGrep.main(new String[] { "$"} );
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }
}
