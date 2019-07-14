package DesignPatterns.demo.demodesignPatterns;

import DesignPatterns.demo.demodesignPatterns.builderpattern.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDesignPatternsApplication.class, args);


		User user1 = new User.UserBuilder("Cristina", "Corici")
				.age(30)
				.phone("1234567")
				.address("Fake address 12")
				.build();

	System.out.println(user1);

	User user2 = new User.UserBuilder("Octav", "Corici")
			.age(55)
			.phone("12348768796")
			.address("Good address 144")
			.build();

		System.out.println(user2);
	}
}
