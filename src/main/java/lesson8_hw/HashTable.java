package lesson8_hw;

public interface HashTable<K, V> {

    boolean put(K key, V value); //добавление

    V get(K key); //Получение по ключу

    V remove(K key); //Удаление по ключу

    int size();

    boolean isEmpty();

    void display();

    interface Entry<K, V> {
        K getKey();

        V getValue();

        void setValue(V value);


    }
}
