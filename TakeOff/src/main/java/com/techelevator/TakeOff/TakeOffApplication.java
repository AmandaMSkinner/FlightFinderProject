/*Generated using Spring Initializr 04/21/23 by AS
Settings:
	Project = Maven,
	Language = Java
	Spring Boot = 3.06
	Packaging = JAR
	Java = 11
	Dependencies:
		Spring Web
		Validation
		Dev Tools
		JPA
		Lombok
*/

package com.techelevator.TakeOff;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TakeOffApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeOffApplication.class, args);
    }

}
