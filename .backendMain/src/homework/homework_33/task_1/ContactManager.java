package homework.homework_33.task_1;

import java.util.ArrayList;
import java.util.List;

class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.println("Данный контакт уже есть.");
        } else {
            contacts.add(contact);
            System.out.println("Контакт добавлен: " + contact);
        }
    }

    public void removeContact(Contact contact) {
        if (contacts.remove(contact)) {
            System.out.println("Контакт удален: " + contact);
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        System.out.println("Контакт не найден.");
        return null;
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        System.out.println("Контакт не найден.");
        return null;
    }
}