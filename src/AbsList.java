package src;

public abstract class AbsList implements IList {

    // addFirst has the same behavior in both NodeList and EmptyList
    // providing it in the abstract class means we only need to write it once
    public NodeList addFirst(int newElt) {
        return new NodeList(newElt, this);
    }
}
