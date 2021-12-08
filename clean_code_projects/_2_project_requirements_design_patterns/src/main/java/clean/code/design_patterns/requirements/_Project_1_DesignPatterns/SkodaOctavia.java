package _Project_1_DesignPatterns;

public class SkodaOctavia extends GetPrice {
    private static int standard = 21000;
    private static int hybrid = 3500;
    private static int metallicTopCoat = 750;
    private static int solidTopCoat = 200;

    @Override
    int getStandard() {
        return standard;
    }

    @Override
    int getHybridPrice() {
        return hybrid;
    }

    @Override
    int getMetallicPrice() {
        return metallicTopCoat;
    }

    @Override
    int getSolidPrice() {
        return solidTopCoat;
    }
}
