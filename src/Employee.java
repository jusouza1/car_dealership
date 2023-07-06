public class Employee {

    private String name;


    public Employee(String name) {
        this.name = name;
    }


   public boolean handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
       if (finance == true) {
           double doubleAmount = vehicle.getPrice() - customer.getCashOnHand();
            if (runCreditHistory(customer, doubleAmount))
                processTransaction(customer, vehicle);
            return true;
       }
       // diferença entre o valor do carro e o dinheiro do cliente
       else if (vehicle.getPrice() <= customer.getCashOnHand()) {
           return processTransaction(customer, vehicle);
       } else {
           System.out.println("Tell customer to bring more money");
           return false;
       }
   }


   public boolean runCreditHistory(Customer customer, double doubleAmount){
       return doubleAmount < 5000 && (customer.getCreditScore() > 500);
   }

   public boolean processTransaction(Customer customer, Vehicle vehicle) {
        customer.setVehicle(vehicle);
       System.out.println("Now the customer " + customer.getName() + " owns a " + customer.getVehicle().getModel());
       return true;
   }


}
