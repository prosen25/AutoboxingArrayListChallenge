import java.util.ArrayList;

public class Bank {

    private String name;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(String customerName) {

        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit) {

        Customer customer = getCustomer(customerName);
        if (customer != null) {
            System.out.println("Found duplicate: " + customer);
            return;
        }

        customers.add(new Customer(customerName, initialDeposit));
    }

    public void addTransaction(String customerName, double amount) {

        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transactions().add(amount);
        }
    }

    public void printStatement(String customerNumber) {

        Customer customer = getCustomer(customerNumber);
        if (customer != null) {
            System.out.println("-".repeat(30));
            System.out.println("Customer name: " + customer.name());
            System.out.println("Transactions:");
            for (double transaction : customer.transactions()) {
                System.out.printf("£%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
            }
        }
    }
}