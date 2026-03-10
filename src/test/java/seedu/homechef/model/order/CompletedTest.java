package seedu.homechef.model.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import seedu.homechef.model.order.completionstatus.Completed;

public class CompletedTest {
    @Test
    public void toStringTest() {
        Completed completed = new Completed();
        assertEquals("Completed", completed.toString());
    }
}
