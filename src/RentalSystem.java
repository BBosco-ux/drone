import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<Rental> activeRentals;

    public RentalSystem() {
        this.vehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.activeRentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentVehicle(Vehicle vehicle, Customer customer, int numberOfDays) {
        if (vehicle.isAvailable()) {
            Rental rental = new Rental(vehicle, customer, numberOfDays);
            activeRentals.add(rental);
            vehicle.addRental(rental);
            return true;
        }
        return false;
    }

    public double calculateRentalPrice(Vehicle vehicle, int numberOfDays) {
        return vehicle.getPricePerDay() * numberOfDays;
    }

    public List<Rental> getVehicleRentalHistory(Vehicle vehicle) {
        return vehicle.getLastFiveRentals();
    }
}
