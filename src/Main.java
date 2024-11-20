public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        // Example usage
        Vehicle car = new Car("ABC123", "Red", 50.0);
        Customer customer = new Customer("John Doe", "123 Main St", 25);

        rentalSystem.addVehicle(car);
        rentalSystem.rentVehicle(car, customer, 5); // Rent for 5 days
    }
}