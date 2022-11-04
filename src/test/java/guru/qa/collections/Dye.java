package guru.qa.collections;

import java.util.ArrayList;
import java.util.List;

public class Dye {
    List<String> storedDyes = new ArrayList<>();

    public void addNewDye(String color) {
        storedDyes.add(color);
    }

    public void removeDye(String color) {
        storedDyes.remove(color);
    }

    public void printDyes() {
        for (int i = 0; i <= storedDyes.size(); i++) {
            System.out.println("Краска в наличии" + i);
        }
    }

    public void searchDye(String color) {
        for (String storedDye : storedDyes) {
            if (storedDyes.contains(color)) {
                System.out.println("Краска в наличии");
            } else System.out.println("Краски нет в наличии");
        }
    }
}

