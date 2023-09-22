package src;

public interface IList {
    // All IList objects must have a size()
    int size();

    Link addFirst(int newElt);
}
