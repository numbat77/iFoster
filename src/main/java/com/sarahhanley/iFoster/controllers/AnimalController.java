package com.sarahhanley.iFoster.controllers;

import com.sarahhanley.iFoster.models.Animal;
import com.sarahhanley.iFoster.models.Species;
import com.sarahhanley.iFoster.models.data.AnimalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    private AnimalDAO animalDAO;

    // Request Path: /animal
    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("animals", animalDAO.findAll());
        model.addAttribute("title", "Foster Animals");
        return "animal/index";
    }
    //Request Path: /add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddAnimalForm(Model model){
        model.addAttribute("title", "Add Animal");
        List<Species> species = Arrays.asList(Species.values());
        model.addAttribute("species", species);
        model.addAttribute(new Animal());
        return "animal/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddAnimalForm(@ModelAttribute Animal newAnimal, @RequestParam String animalName){
        newAnimal.setName(animalName);
        animalDAO.save(newAnimal);
        return "redirect:";

    }
}
