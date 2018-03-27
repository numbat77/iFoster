package com.sarahhanley.iFoster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("animal")
public class AnimalController {

    static ArrayList<String> animals = new ArrayList<>();

    // Request Path: /animal
    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("animals", animals);
        model.addAttribute("title", "Animal Profile");
        return "animal/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddAnimalForm(Model model){
        model.addAttribute("title", "Add Animal");
        return "animal/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddAnimalForm(@RequestParam String animalName){
        animals.add(animalName);
        return "redirect:";
    }
}
