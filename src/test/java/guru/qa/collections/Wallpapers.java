package guru.qa.collections;

import java.util.HashSet;
import java.util.Set;

public class Wallpapers {
    Set<String> storedVarieties = new HashSet<>();

    public void addVariety(String variety) {
        storedVarieties.add(variety);
    }

    public void removeVariety(String variety) {
        storedVarieties.remove(variety);
    }

    public void printVariety() {
        int i = 0;
        while (i <= storedVarieties.size()) {
            i++;
            System.out.println(storedVarieties);
        }
    }

    public void searchVariety(String variety) {
        for (String storedVariety : storedVarieties) {
            if (storedVarieties.contains(variety)) {
                System.out.println("Данный вид обоев есть в наличии");
            } else System.out.println("Данного вида обоев нет в наличии");
        }
    }
}