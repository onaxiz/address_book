package ru.petproject.javafx.phonesbook.interfaces;

import ru.petproject.javafx.phonesbook.objects.Person;

public interface AddressBook {

    void add(Person person);
    void delete(Person person);
    void update(Person person);
}
