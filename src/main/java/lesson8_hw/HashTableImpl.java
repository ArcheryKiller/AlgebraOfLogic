package lesson8_hw;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    static class Item<K, V> implements Entry<K, V> {

        private final K key;
        private V value;
        private Item<K, V> next;

        Item(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        public Item<K, V> getNext() {
            return next;
        }

        public void setNext(Item<K, V> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Item{" + "kay=" + key + ", value=" + value + '}';
        }
    }

    private final Item<K, V>[] data;
    private final Item<K, V> emptyItem;

    private int size;

    public HashTableImpl(int initialCapacity) {
        this.data = new Item[initialCapacity * 2];
        emptyItem = new Item<>(null, null);

        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }

        int index = indexOf(key);

        if (data[index] == null) {

            data[index] = new Item<K, V>(key, value);

        } else {

            Item<K, V> entry = data[index];

            while (entry.getNext() != null && entry.getKey() != key) {
                entry = entry.getNext();
            }

            if (entry.getKey() == key) {
                entry.setValue(value);

            } else {
                entry.setNext(new Item<K, V>(key, value));
            }
        }
        return true;
    }

    protected int getStep(K key) {
        return 1;
    }

    private boolean isKeysEquals(Item<K, V> item, K key) {
        if (item == emptyItem) {
            return false;
        }
        return item.getKey() == null ? key == null : item.getKey().equals(key);
    }

    private int indexOf(K key) {
        int index = hashFunc(key);

        return index;
    }

    @Override
    public V get(K key) {
        int index = indexOf(key);

        if (data[index] == null) {
            return null;

        } else {
            Item<K, V> entry = data[index];

            while (entry != null && entry.getKey() != key) {
                entry = entry.getNext();
            }

            if (entry == null) {
                return null;

            } else {
                return entry.getValue();
            }
        }
    }

    @Override
    public V remove(K key) {

        int index = indexOf(key);
        Item<K, V> prevEntry = null;
        Item<K, V> entry = data[index];

        if (data[index] != null) {


            while (entry.getNext() != null && entry.getKey() != key) {
                prevEntry = entry;
                entry = entry.getNext();
            }

            if (entry.getKey() == key) {

                if (prevEntry == null) {
                    data[index] = entry.getNext();

                } else {
                    prevEntry.setNext(entry.getNext());
                }
            }

        }
        return entry.getValue();

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public void display() {
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]%n", i, data[i]);
        }
        System.out.println("----------------");
    }
}
