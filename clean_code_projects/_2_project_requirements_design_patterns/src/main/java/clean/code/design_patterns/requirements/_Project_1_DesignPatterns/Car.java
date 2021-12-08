package main.java.clean.code.design_patterns.requirements._Project_1_DesignPatterns;

public class Car {
    private String model;
    private int year;
    private boolean hasParkAssist;
    private boolean hasLaneAssist;
    private boolean hasHeatedSeats;
    private boolean isHybrid;
    private String topCoat; //metallic/solid

    public Car (CarBuilder carBuilder) {
        this.model = carBuilder.getModel();
        this.year = carBuilder.getYear();
        this.hasParkAssist = carBuilder.hasParkAssist();
        this.hasLaneAssist = carBuilder.hasLaneAssist();
        this.hasHeatedSeats = carBuilder.hasHeatedSeats();
        this.isHybrid = carBuilder.isHybrid();
        this.topCoat = carBuilder.getTopCoat();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean hasParkAssist() {
        return hasParkAssist;
    }

    public boolean hasLaneAssist() {
        return hasLaneAssist;
    }

    public boolean hasHeatedSeats() {
        return hasHeatedSeats;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public String getTopCoat() {
        return topCoat;
    }

    public static class CarBuilder {
        private String model;
        private int year;
        private boolean hasParkAssist;
        private boolean hasLaneAssist;
        private boolean hasHeatedSeats;
        private boolean isHybrid;
        private String topCoat = "solid"; //metallic/solid

        public CarBuilder(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public CarBuilder setHasParkAssist(boolean hasParkAssist) {
            this.hasParkAssist = hasParkAssist;
            return this;
        }

        public CarBuilder setHasLaneAssist(boolean hasLaneAssist) {
            this.hasLaneAssist = hasLaneAssist;
            return this;
        }

        public CarBuilder setHasHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        public CarBuilder setIsHybrid(boolean isHybrid) {
            this.isHybrid = isHybrid;
            return this;
        }

        public CarBuilder setTopCoat(String topCoat) {
            this.topCoat = topCoat;
            return this;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public boolean hasParkAssist() {
            return hasParkAssist;
        }

        public boolean hasLaneAssist() {
            return hasLaneAssist;
        }

        public boolean hasHeatedSeats() {
            return hasHeatedSeats;
        }

        public boolean isHybrid() {
            return isHybrid;
        }

        public String getTopCoat() {
            return topCoat;
        }

        public Car build() {return new Car(this);}
    }

    @Override
    public String toString() {
        return "\nModel: " + this.model + "\nYear: " + this.year + "\nPark Assist: " + this.hasParkAssist +
                "\nLane Assist: " + this.hasLaneAssist + "\nHeated Seats: " + this.hasHeatedSeats +
                "\nHybrid: " + this.isHybrid + "\nTop Coat: " +
                this.topCoat;
    }
}

