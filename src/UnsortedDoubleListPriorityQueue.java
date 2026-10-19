/**
 * Kolejka priorytetowa oparta na liście dwukierunkowej nieuporządkowanej.
 */
public class UnsortedDoubleListPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {

    private final DoubleList<T> list = new DoubleList<>();

    @Override
    public void insert(T value) {
        // ...
    }

    //Pozostałe metody interfejsu:
}
