package collections;

import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {

        String arr[] = {"Rutuja", "Nikhil", "Amit", "Priya"};

        NameContainer container = new NameContainer(arr);

        Iterator<String> itr = container.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class NameContainer {

    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = names.length;
    }

    public Iterator<String> iterator() {
        return new NameContainerIterator();
    }

    private class NameContainerIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}