package com.sarahhanley.iFoster.controllers;

import com.sarahhanley.iFoster.models.GenderTypes;
import com.sarahhanley.iFoster.models.Human;
import com.sarahhanley.iFoster.models.data.AnimalDAO;
import com.sarahhanley.iFoster.models.data.HumanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("human")
public class HumanController {

    @Autowired
    private HumanDAO humanDAO;

    // Request Path: /human
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("humans", humanDAO.findAll());
        model.addAttribute("title", "Foster Families");

        return "human/allHumans";
    }

    //Request Path: /add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddAnimalForm(Model model) {
        model.addAttribute("title", "Add Human");
        model.addAttribute((new Human()));
        model.addAttribute("genderTypes", GenderTypes.values());
        return "human/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddHumanForm(@ModelAttribute @Valid Human newHuman) {
        humanDAO.save(newHuman);
        return "redirect:";
    }

    @RequestMapping(value = "humanProfile/{humanId}", method = RequestMethod.GET)
    public String viewHumanProfile(@PathVariable int humanId, Model model) {
        Human human = humanDAO.findById(humanId).get();
        model.addAttribute(human);
        model.addAttribute("title", human.getFirstName());
        return "human/humanProfile";
    }

}
