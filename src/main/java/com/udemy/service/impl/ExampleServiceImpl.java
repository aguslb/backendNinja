package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class );

	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Jhon", (int) (Math.random() * 254) + 1));
		people.add(new Person("Bran", (int) (Math.random() * 254) + 1));
		people.add(new Person("Jose", (int) (Math.random() * 254) + 1));
		people.add(new Person("Agustin", (int) (Math.random() * 254) + 1));
		people.add(new Person("Oscar", (int) (Math.random() * 254) + 1));
		people.add(new Person("David", (int) (Math.random() * 254) + 1));
		people.add(new Person("Graciela", (int) (Math.random() * 254) + 1));
		people.add(new Person("Gerardo", (int) (Math.random() * 254) + 1));
		people.add(new Person("Misael", (int) (Math.random() * 254) + 1));
		LOG.info("Service Hello :D");
		return people;
	}

}
