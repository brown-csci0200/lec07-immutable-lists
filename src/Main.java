package src;

public class Main {

    public static void main(String[] args) {
        NodeList L1 = new NodeList(2, new EmptyList());
        L1 = new NodeList(5, L1);
        L1 = new NodeList(3, L1);
        L1.addFirst(10);

        new NodeList(3, new NodeList(5, new NodeList(2, new EmptyList())));
    }
}
