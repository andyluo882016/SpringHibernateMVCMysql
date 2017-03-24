package com.app.controller.dao;
import java.util.List;
import com.app.controller.domain.*;
public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
