package lessons.lesson_26;

import java.util.ArrayList;
import java.util.List;


class PhoneCollection {
    private List<Phone> phones;

    public PhoneCollection() {
        this.phones = new ArrayList<>();
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void removePhoneByIndex(int index) {
        if (index >= 0 && index < phones.size()) {
            phones.remove(index);
        }
    }

    public void removePhone(Phone phone) {
        phones.remove(phone);
    }
}