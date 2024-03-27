package homework.homework_33.task_1;

public class ContactManagerDemo {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Анна", "123456789");
        Contact contact2 = new Contact("Анатолий", "987654321");
        Contact contact3 = new Contact("Виктор", "555555555");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);

        System.out.println("Контакты: " + contactManager.getContacts());

        contactManager.removeContact(contact2);

        System.out.println("Контакт после удаления.: " + contactManager.getContacts());

        Contact foundContact = contactManager.getContactByName("John");
        System.out.println("Найденный контакт: " + foundContact);

        Contact notFoundContact = contactManager.getContactByPhoneNumber("111111111");
        System.out.println("Контакт не найден: " + notFoundContact);
    }
}
