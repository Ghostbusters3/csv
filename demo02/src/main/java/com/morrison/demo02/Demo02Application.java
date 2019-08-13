package com.morrison.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.morrison.demo02.model.Users;
import com.morrison.demo02.service.UserService;

@SpringBootApplication
public class Demo02Application implements CommandLineRunner {
	@Autowired
	UserService userService;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SpringApplication.run(Demo02Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		CsvMapper csvMapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		ObjectReader oReader = csvMapper.readerFor(Users.class).with(schema);
		List<Users> users = new ArrayList<>();

		try (Reader reader = new FileReader("D:/DemoProject/demo02/src/main/resources/file.csv")) {
			MappingIterator<Users> mi = oReader.readValues(reader);
			while (mi.hasNext()) {
				Users current = mi.next();
				users.add(current);
				System.out.println(current);
			}

		}
		System.out.println("Number of Users into list: " + users.size());

	}
}
