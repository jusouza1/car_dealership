public class Dealership {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tom", "123 Anything St.", 15000, 580.3);

        Vehicle vehicle = new Vehicle("Gol", "2018", "Volkswagen", "hetch", "Blue", 14000);

        Employee employee = new Employee("John");

        customer1.purchaseCar(vehicle, employee, false);

        employee.handleCustomer(customer1, true, vehicle);

    }
}