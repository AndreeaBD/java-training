package _Project_1_DesignPatterns;

public abstract class GetPrice {
    int getPrice(Car car) {
        String model = car.getModel();
        int finalPrice = getStandard();

        if(car.hasHeatedSeats()) {
            finalPrice += 500;
        }

        if(car.hasLaneAssist()) {
            finalPrice += 1000;
        }

        if(car.isHybrid()) {
            finalPrice += getHybridPrice();
        }

        if(car.hasParkAssist()) {
            finalPrice += 1200;
        }

        switch (car.getTopCoat()) {
            case "metallic" -> finalPrice += getMetallicPrice();
            case "solid" -> finalPrice += getSolidPrice();
        }

        return finalPrice;
    }

    abstract int getStandard();
    abstract int getHybridPrice();
    abstract int getMetallicPrice();
    abstract int getSolidPrice();
}
