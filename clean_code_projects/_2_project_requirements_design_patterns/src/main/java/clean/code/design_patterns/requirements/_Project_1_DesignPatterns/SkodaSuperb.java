package main.java.clean.code.design_patterns.requirements._Project_1_DesignPatterns;

public class SkodaSuperb extends GetPrice {
    private static int standard = 32000;
    private static int hybrid = 4500;
    private static int metallicTopCoat = 1000;
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
