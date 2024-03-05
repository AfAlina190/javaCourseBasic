package homework.homework_33.task_1;

class ContactDemo  {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Иван Иванов", "123-456-7890");
        Contact contact2 = new Contact("Петя Петров", "987-654-3210");
        Contact contact3 = new Contact("Александр Сидоров", "555-123-4567");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);

        System.out.println("Все контакты: " + contactManager.getContacts());

        Contact retrievedContact = contactManager.getContactByName("Иван Иванов");
        System.out.println("Полученный контакт по имени: " + retrievedContact);

        retrievedContact = contactManager.getContactByPhoneNumber("555-123-4567");
        System.out.println("Контакт получен по номеру телефона: " + retrievedContact);

        contactManager.removeContact(contact1);

        System.out.println("Все контакты после удаления: " + contactManager.getContacts());
    }
}