package main.java.clean.code.design_patterns.requirements._Project_1_DesignPatterns;

public class Main {
    public static void main(String... args) {
        Car car1 = new Car.CarBuilder("Scala", 2021)
                .setHasHeatedSeats(true)
                .setIsHybrid(false)
                .setHasLaneAssist(true)
                .build();
        Car car2 = new Car.CarBuilder("Octavia", 2021)
                .setIsHybrid(true)
                .setTopCoat("metallic")
                .setHasParkAssist(true)
                .build();
        Car car3 = new Car.CarBuilder("Superb", 2020)
                .build();

        System.out.println(car1 + "\nFinal Price: " + calculate(car1));
        System.out.println(car2 + "\nFinal Price: " + calculate(car2));
        System.out.println(car3 + "\nFinal Price: " + calculate(car3));
    }

    public static int calculate(Car car) {
        SkodaOctavia octaviaPrice = new SkodaOctavia();
        SkodaScala scalaPrice = new SkodaScala();
        SkodaSuperb superbPrice = new SkodaSuperb();
        int price = 0;

        switch (car.getModel()) {
            case "Scala" -> price = scalaPrice.getPrice(car);
            case "Octavia" -> price = octaviaPrice.getPrice(car);
            case "Superb" -> price = superbPrice.getPrice(car);
        }

        return price;
    }
}
