package com.laivie.entity.controller;


import com.laivie.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@RestController
public class ServerController {

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
