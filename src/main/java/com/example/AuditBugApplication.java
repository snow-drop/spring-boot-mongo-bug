package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class AuditBugApplication {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(AuditBugApplication.class, args);
    }

    @PostConstruct
    public void onBoot() {
        Person person = personRepository.save(getPerson());
        log.info("{}", person);
    }

    private Person getPerson() {
        Person person = new Person();
        person.setLastName(getRandomString());
        person.setFirstName(getRandomString());
        return person;
    }


    private String getRandomString() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

}
