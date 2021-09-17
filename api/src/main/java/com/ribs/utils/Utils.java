package com.ribs.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {


    private static final Properties properties = new Properties();
    private static final Utils utils = new Utils();

    private Utils() {
        fetchProperties();

    }

    public static Properties fetchProperties() {
        try {
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getResource(String resource) {
        return properties.getProperty(resource);
    }
}