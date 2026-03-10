package seedu.homechef.model.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import seedu.homechef.model.order.completionstatus.InProgress;

public class InProgressTest {
    @Test
    public void toStringTest() {
        InProgress inProgress = new InProgress();
        assertEquals("In progress", inProgress.toString());
    }
}
