import java.time.LocalDateTime;

public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private LocalDateTime startDate;
    private int numberOfDays;
    private double totalPrice;

    public Rental(Vehicle vehicle, Customer customer, int numberOfDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.startDate = LocalDateTime.now();
        this.numberOfDays = numberOfDays;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        return vehicle.getPricePerDay() * numberOfDays;
    }

    // Getters
}
