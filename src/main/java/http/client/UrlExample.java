package com.dmdev.http.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("file:/D:/test/http-servlets-starter/src/com/dmdev/http/socket/DatagramRunner.java");
            URLConnection urlConnection = url.openConnection();
            System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkGoogle() {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();

            urlConnection.setDoOutput(true);

            try (OutputStream outputStream = urlConnection.getOutputStream();) {
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
