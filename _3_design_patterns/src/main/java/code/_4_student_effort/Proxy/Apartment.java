package Proxy;

public class Apartment implements Comparable<Apartment> {
    protected String location;
    protected int monthlyRentCost;
    protected boolean rented = false;

    public Apartment() {
    }

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public boolean isNotRented() {
        return !this.rented;
    }

    @Override
    public int compareTo (Apartment other) {
        return this.monthlyRentCost - other.monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment in " + this.location + " at monthly rate " + this.monthlyRentCost;
     }
}
