package com.juriy.interview.http;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Juriy Bura
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
		new HttpBenchmark(new File("speedtest.log"), HttpBenchmark.FULL, "http://dracojs.com").measure(2);
    }
}
