package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {

    private final String customer;
    private final List<Performance> performances;

    /**
     * Constructs an Invoice for a specific customer and their performances.
     *
     * @param customer     the name of the customer
     * @param performances the list of performances to be billed
     */
    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    /**
     * Returns the name of the customer.
     *
     * @return the customer name
     */
    public final String getCustomer() {
        return customer;
    }

    /**
     * Returns the list of performances for this invoice.
     *
     * @return the list of performances
     */
    public final List<Performance> getPerformances() {
        return performances;
    }
}
