package com.app.controller.service;
import java.util.List;

import com.app.controller.domain.Person;
public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
