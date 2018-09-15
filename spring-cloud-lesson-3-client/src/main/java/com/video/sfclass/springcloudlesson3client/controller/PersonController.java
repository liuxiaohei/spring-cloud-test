package com.video.sfclass.springcloudlesson3client.controller;

import com.video.sfclass.springcloudlesson3client.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final Person person;

    public PersonController(Person person) {
        this.person  = person;
    }

    @GetMapping("getPerson")
    public Person getPerson() {
        return person;
    }
}
