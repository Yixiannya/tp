package seedu.homechef.model.order.completionstatus;

/**
 * Represents a Order's completed status in the HomeChef.
 */
public class Completed extends CompletionStatus {
    /**
     * Constructs a {@code Completed} status.
     */
    public Completed() {
        super(1);
    }

    @Override
    public String toString() {
        return "Completed";
    }
}
