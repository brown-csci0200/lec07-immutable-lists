package src;

public class Main {

    public static void main(String[] args) {
        IList l1 = new EmptyList();
        IList l2 = new Link(5, l1);

        IList l3 = new Link(5, new Link(42, new EmptyList()));

        // L2 = L_immut.addFirst(4)
    }
}
