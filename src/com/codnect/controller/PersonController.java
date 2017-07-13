package com.codnect.controller;

import com.codnect.model.Person;
import com.codnect.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Burak Köken on 13.7.2017.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/createPerson")
    public String showCreatePersonForm(Model model){
        model.addAttribute("person", new Person());
        return "person/personCreate";
    }

    @PostMapping("/createPerson")
    public String createPersonFormSubmit(@ModelAttribute Person person){
        personService.createPerson(person);
        return "redirect:/person/personList";
    }

    @RequestMapping("/personList")
    public ModelAndView personList(){
        List<Person> personList = personService.findAllPerson();

        ModelAndView modelAndView = new ModelAndView("person/personList");
        modelAndView.addObject("personList", personList);
        return modelAndView;
    }

}
