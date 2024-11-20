import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String licensePlate;
    private String color;
    private double pricePerDay;
    private boolean isRented;
    private List<Rental> rentalHistory;

    public Vehicle(String licensePlate, String color, double pricePerDay) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.pricePerDay = pricePerDay;
        this.isRented = false;
        this.rentalHistory = new ArrayList<>();
    }

    public boolean isAvailable() {
        return !isRented;
    }

    public void addRental(Rental rental) {
        rentalHistory.add(rental);
        if (rentalHistory.size() > 5) {
            rentalHistory.remove(0);
        }
    }

    public List<Rental> getLastFiveRentals() {
        return new ArrayList<>(rentalHistory);
    }

    public double getPricePerDay() {
        double pricePerDay1 = pricePerDay;
        return 0;
    }

    // Getters and setters
}
