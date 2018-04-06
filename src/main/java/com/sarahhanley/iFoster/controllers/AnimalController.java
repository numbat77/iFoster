package com.sarahhanley.iFoster.controllers;

import com.sarahhanley.iFoster.models.Animal;
import com.sarahhanley.iFoster.models.GenderTypes;
import com.sarahhanley.iFoster.models.SpeciesType;
import com.sarahhanley.iFoster.models.data.AnimalDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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
        model.addAttribute(new Animal());
        model.addAttribute("speciesTypes", SpeciesType.values());
        model.addAttribute("genderTypes", GenderTypes.values());
        return "animal/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddAnimalForm(@ModelAttribute @Valid Animal newAnimal){
        animalDAO.save(newAnimal);
        return "redirect:";

    }
}
