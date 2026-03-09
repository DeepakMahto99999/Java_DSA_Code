public class ArraylistImplementation {

    // static because main() is static
    static class MyArrayList<T> {
        private Object[] data;
        private int size;

        private static final int DEFAULT_CAPACITY = 10;

        public MyArrayList() {
            data = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public int size() {
            return size;
        }

        public int capacity() {
            return data.length;
        }

        // O(1)
        public T get(int index) {
            checkIndex(index);
            return (T) data[index];
        }

        // O(1)
        public void set(int index, T value) {
            checkIndex(index);
            data[index] = value;
        }

        // Amortized O(1)
        public void add(T value) {
            ensureCapacity();
            data[size++] = value;
        }

        // O(n)
        public void add(int index, T value) {
            if (index < 0 || index > size) throw new IndexOutOfBoundsException();

            ensureCapacity();

            // shift right
            for (int i = size - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = value;
            size++;
        }

        // O(n)
        public T remove(int index) {
            checkIndex(index);
            T removed = (T) data[index];

            // shift left
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            size--;
            return removed;
        }

        // O(n)
        public boolean contains(T value) {
            for (int i = 0; i < size; i++) {
                if (data[i].equals(value)) return true;
            }
            return false;
        }

        // capacity growth ≈ 1.5x
        private void ensureCapacity() {
            if (size == data.length) {
                int newCapacity = data.length + (data.length >> 1); // x1.5
                Object[] newArr = new Object[newCapacity];

                // O(n) copy
                for (int i = 0; i < size; i++)
                    newArr[i] = data[i];

                data = newArr;
            }
        }

        private void checkIndex(int idx) {
            if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(data[i]);
                if (i < size - 1) sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }


    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        // add at end
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial List: " + list);

        // get and set
        System.out.println("get(2) = " + list.get(2)); // 30
        list.set(2, 99);
        System.out.println("After set(2,99): " + list);

        // add with index
        list.add(2, 555);
        System.out.println("After add(2,555): " + list);

        // remove
        list.remove(3);
        System.out.println("After remove(3): " + list);

        // contains
        System.out.println("Contains 40? " + list.contains(40));
        System.out.println("Contains 777? " + list.contains(777));

        // force capacity growth
        for (int i = 0; i < 20; i++)
            list.add(i * 100);

        System.out.println("After many adds: " + list);
        System.out.println("Final Capacity: " + list.capacity());
        System.out.println("Final Size: " + list.size());
    }
}
