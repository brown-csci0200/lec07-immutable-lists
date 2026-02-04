package src;

public class EmptyList extends AbsList /* implements IList */ {
    // No fields
    public EmptyList() {
        // Nothing to do
    }

    // addFirst implementation moved to abstract class AbsList

    public boolean isEmpty() {
        return true;
    }
}
