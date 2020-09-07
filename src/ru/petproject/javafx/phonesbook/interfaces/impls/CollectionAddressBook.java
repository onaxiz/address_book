package ru.petproject.javafx.phonesbook.interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import ru.petproject.javafx.phonesbook.interfaces.AddressBook;
import ru.petproject.javafx.phonesbook.objects.Person;

import java.util.ArrayList;
import java.util.Observable;

public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personsList = FXCollections.observableArrayList();
    @Override
    public void add(Person person) {
        personsList.add(person);
    }

    @Override
    public void delete(Person person) {
        personsList.remove(person);
    }

    @Override
    public void update(Person person) {
        // if we use db
    }

    public ObservableList<Person> getPersonsList() {
        return personsList;
    }

    public void print(){
        int number = 0;
        System.out.println();
        for (Person person : personsList) {
            number++;
            System.out.println(number+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }

    }

    public void fillTestData(){
        personsList.add(new Person("Иван", "23948723948"));
        personsList.add(new Person("Роман", "345345345"));
        personsList.add(new Person("Антон", "345345345"));
        personsList.add(new Person("Джон", "23423423"));
        personsList.add(new Person("Джек", "234234"));
        personsList.add(new Person("Алиса", "456456"));
        personsList.add(new Person("Боб", "34534345"));
    }

}
