package com.laivie.controller;


import com.laivie.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProviderController {

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Person searchPerson(@PathVariable Integer id, HttpServletRequest request) {
        Person person = new Person();
        person.setId(id);
        person.setName("Spirit");
        person.setMessage(request.getRequestURL().toString());
        return person;

    }
}