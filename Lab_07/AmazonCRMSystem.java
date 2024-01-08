import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

// Customer class
class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Product class
class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

// Order class
class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(String orderId, Customer customer, ArrayList<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    // getters and setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

public class AmazonCRMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayLists for managing dynamic lists
        ArrayList<Customer> customersList = new ArrayList<>();
        ArrayList<Product> productsList = new ArrayList<>();
        ArrayList<Order> ordersList = new ArrayList<>();

        // HashMaps for unique identification and swift retrieval
        HashMap<String, Customer> customerMap = new HashMap<>();
        HashMap<String, Product> productMap = new HashMap<>();

        // HashSet for efficiently organizing unique products
        HashSet<Product> uniqueProductsSet = new HashSet<>();

        // TreeSet for ordered sorting
        TreeSet<Customer> sortedCustomersSet = new TreeSet<>();
        TreeSet<Product> sortedProductsSet = new TreeSet<>();

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter Customer Details");
            System.out.println("2. Enter Product Details");
            System.out.println("3. Enter Order Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // User input for customer
                    System.out.println("\nEnter customer details:");
                    System.out.print("Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Customer Name: ");
                    String customerName = scanner.nextLine();

                    Customer customer = new Customer(customerId, customerName);
                    customersList.add(customer);
                    customerMap.put(customerId, customer);
                    break;

                case 2:
                    // User input for product
                    System.out.println("\nEnter product details:");
                    System.out.print("Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Product Name: ");
                    String productName = scanner.nextLine();

                    Product product = new Product(productId, productName);
                    productsList.add(product);
                    productMap.put(productId, product);
                    uniqueProductsSet.add(product);
                    sortedProductsSet.add(product);
                    break;

                case 3:
                    // User input for order
                    System.out.println("\nEnter order details:");
                    System.out.print("Order ID: ");
                    String orderId = scanner.nextLine();

                    // For simplicity, assuming the order contains only one product
                    ArrayList<Product> orderProducts = new ArrayList<>();
                    orderProducts.add(productsList.get(0)); 

                    Order order = new Order(orderId, customersList.get(0), orderProducts);
                    ordersList.add(order);
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        // Close the scanner
        scanner.close();
    }
}
