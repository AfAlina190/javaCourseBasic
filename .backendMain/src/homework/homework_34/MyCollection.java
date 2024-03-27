package homework.homework_34;

import java.util.Arrays;

    public class MyCollection<E> {

        private Object[] elements;
        private int size;

        public MyCollection() {
            this.elements = new Object[10]; // начальная емкость массива
            this.size = 0;
        }

        public void add(E element) {
            ensureCapacity(); // убедимся, что массив достаточно велик
            elements[size++] = element;
        }

        public void add(int index, E element) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }

            ensureCapacity();

            // сдвигаем элементы вправо
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }

            elements[index] = element;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }

            // сдвигаем элементы влево
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }

            elements[--size] = null; // обнуляем последний элемент и уменьшаем размер
        }

        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                // увеличиваем размер массива вдвое, если необходимо
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements, newCapacity);
            }
        }

        public static void main(String[] args) {
            // Пример использования
            MyCollection<String> myCollection = new MyCollection<>();
            myCollection.add("Element 1");
            myCollection.add("Element 2");
            myCollection.add("Element 3");

            System.out.println("Collection size: " + myCollection.size());

            myCollection.add(1, "Inserted Element");

            System.out.println("Collection size after insertion: " + myCollection.size());

            myCollection.remove(2);

            System.out.println("Collection size after removal: " + myCollection.size());
        }
    }

