package seedu.homechef.model.order.completionstatus;

/**
 * Represents a Order's in progress status in the HomeChef.
 */
public class InProgress extends CompletionStatus {
    /**
     * Constructs a {@code InProgress} status.
     */
    public InProgress() {
        super(0);
    }

    @Override
    public String toString() {
        return "In progress";
    }
}
