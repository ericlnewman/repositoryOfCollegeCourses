package retail;

	/** Class that uses a queue to hold the order in the order
	 * they were taken. The queue should contain the customer
	 * last name, order number, and order total cost.
	 */
import java.util.Queue;
import java.util.LinkedList;

class Order {
    // Fields
    private Queue<Order> order;
    private String lastName;
    private int orderNum;
    private double cost;

    // Constructors
    public Order() {
        order = new LinkedList<>();
    }
    public Order(String lastName, int orderNum, double cost) {
        this.lastName = lastName;
        this.orderNum = orderNum;
        this.cost = cost;
    }

    // Getter methods
    public Queue<Order> getOrder() {
        return order;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getOrderNum() {
        return orderNum;
    }

    public double getCost() {
        return cost;
    }

    // Add to purchase order
    public void addPurchase(String lastName, int orderNumber, double cost) {
        order.add(new Order(lastName, orderNumber, cost));
    }

    // Remove an order
    public void removeOrder(int orderNum) {
        for (Order aOrder : order) {
            if (aOrder.getOrderNum() == orderNum) {
                order.remove(aOrder);
                break;
            }
        }
    }
}