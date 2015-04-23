package com.juriy.interview.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Juriy Bura
 */
public class HttpBenchmark {

    public static int BRIEF = 1;
    public static int FULL = 2;

    private File file;
    private PrintWriter out;
    private int format;

    private HttpClient client;
    private String url;

    public HttpBenchmark(File file, int format, String url) throws FileNotFoundException {
        this.file = file;
        this.out = new PrintWriter(file);
        this.format = format;
        this.client = new HttpClient();
        this.url = url;
    }

    public void measure(long times) {
        for (int i = 0; i < times; i++) {
            long start = System.currentTimeMillis();
            String text = "";
            try {
                text = client.sendGet(url);
            } catch (Exception e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            long delta = end - start;

            boolean isHealthy = text.length() > 0;

            if (format == BRIEF) {
                out.println("Done in " + delta + " ms");
            } else if (format == FULL) {
                out.println("Done in " + delta + " ms. Healthy -  " + isHealthy + " response is " + text);
            }
        }

        out.flush();
        out.close();
    }
}
