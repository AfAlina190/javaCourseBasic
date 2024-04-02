package lessons.lesson_26;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        PhoneCollection phoneCollection = new PhoneCollection();

        // Показываем, что коллекция создана и пуста
        System.out.println("Phone Collection: " + phoneCollection.getPhones());

        // Добавление одного элемента
        Phone phone1 = new Phone(1, "iPhone 13", "Apple", 999.99);
        phoneCollection.addPhone(phone1);

        // Показываем, что элемент добавлен
        System.out.println("Phone Collection after adding one phone: " + phoneCollection.getPhones());

        // Добавление еще нескольких элементов (до 5)
        phoneCollection.addPhone(new Phone(2, "Galaxy S21", "Samsung", 899.99));
        phoneCollection.addPhone(new Phone(3, "Pixel 6", "Google", 799.99));
        phoneCollection.addPhone(new Phone(4, "OnePlus 9", "OnePlus", 699.99));
        phoneCollection.addPhone(new Phone(5, "Mi 11", "Xiaomi", 599.99));

        // Показываем коллекцию после добавления элементов
        System.out.println("Phone Collection after adding multiple phones: " + phoneCollection.getPhones());

        // Удаление одного элемента по индексу
        phoneCollection.removePhoneByIndex(2); // Удаление третьего элемента (индекс 2)

        // Показываем коллекцию после удаления элемента по индексу
        System.out.println("Phone Collection after removing one phone by index: " + phoneCollection.getPhones());

        // Удаление одного элемента по объекту
        Phone phoneToRemove = new Phone(4, "OnePlus 9", "OnePlus", 699.99);
        phoneCollection.removePhone(phoneToRemove);

        // Показываем коллекцию после удаления элемента по объекту
        System.out.println("Phone Collection after removing one phone by object: " + phoneCollection.getPhones());
    }
}


