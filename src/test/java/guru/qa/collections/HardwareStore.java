package guru.qa.collections;

public class HardwareStore {

    public static void main(String[] args) {
        Dye dyes = new Dye();
        dyes.addNewDye("Красный");
        dyes.addNewDye("Синий");
        dyes.addNewDye("Зеленый");
        dyes.removeDye("Красный");
        dyes.printDyes();
        dyes.searchDye("Желтый");


        Fasteners fasteners = new Fasteners();
        fasteners.addFasteners(100, "Гвоздь 1");
        fasteners.addFasteners(120, "Гвоздь 2");
        fasteners.addFasteners(150, "Гвоздь 3");
        fasteners.addFasteners(200, "Гвоздь 4");
        fasteners.removeFasteners("Гвоздь 1");
        fasteners.printFasteners();

        Wallpapers varieties = new Wallpapers();
        varieties.addVariety("Бумажные обои");
        varieties.addVariety("Виниловые обои");
        varieties.addVariety("Флизелиновые обои");
        varieties.removeVariety("Бумажные обои");
        varieties.printVariety();
        varieties.searchVariety("Виниловые обои");
    }
}
