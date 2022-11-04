package guru.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class Fasteners {
    Map<Integer, String> storedFasteners = new HashMap<>();

    public void addFasteners(int size, String name) {
        storedFasteners.put(size, name);
    }

    public void removeFasteners(String name) {
        storedFasteners.remove(name);
    }

    public void printFasteners() {
        for (Map.Entry<Integer, String> entry : storedFasteners.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}