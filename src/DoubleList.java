import java.util.NoSuchElementException;

/**
 * Lista dwukierunkowa niecykliczna z wskaźnikami na początek (head) i koniec (tail).
 */
public class DoubleList<T> {

    private static class Node<T> {
        private final T value;
        private Node<T> prev;
        private Node<T> next;

        // ewentualne konstruktory:
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    @SuppressWarnings("unchecked")
    private static <T> int compare(T a, T b) {
        return ((Comparable<T>) a).compareTo(b);
    }


    //Niezbędne metody:
    //
    // UWAGA:
    // Do porównywania 2 elementów typu T należy używać konstrukcji:
    //    if ( compare(v1, v2) >= 0 )    - wartość dodatnia v1 > v2


}
