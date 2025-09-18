package util;

import java.io.*;
import java.util.*;

public class UsageFactory {
    private static Map<String, Integer> values = new HashMap<>();

    static {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                values.put(parts[0], Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            System.out.println("Error loading usage values.");
        }
    }

    public static int getUsage(String key) {
        return values.getOrDefault(key, 0);
    }
}
