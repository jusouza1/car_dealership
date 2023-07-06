public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private Vehicle vehicle;

    private double creditScore;

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {

    }

    public Customer() {
    }

    public Customer(String name, String address, double cashOnHand, double creditScore) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }
}
