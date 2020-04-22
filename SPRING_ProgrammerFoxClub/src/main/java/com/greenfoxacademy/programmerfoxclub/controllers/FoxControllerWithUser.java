package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxControllerWithUser {

    private FoxService foxService;
    private UserService userService;

    @Autowired
    public FoxControllerWithUser(FoxService foxService, UserService userService) {
        this.foxService = foxService;
        this.userService = userService;
    }

    @GetMapping("/nutritionstore")
    public String renderNutritionStorePage(@RequestParam(required = false) String foxname, Model model) {
        if (foxname == null) {
            return "redirect:/login";
        }
        model.addAttribute("user", userService.findByFoxName(foxname));
        model.addAttribute("fox", foxService.find(foxname));
        model.addAttribute("foods", foxService.find(foxname).getFoodsList());
        model.addAttribute("drinks", foxService.find(foxname).getDrinksList());
//        model.addAttribute("active", "nutrition-store");
        return "nutritionstore_with_user";
    }

    @PostMapping("/nutritionstore")
    public String addFoodAndDrink(String name, String food, String drink, Model model) {
        foxService.feedAndRecordChanges(name, food);
        foxService.drinkAndRecordChanges(name, drink);
        User user = userService.findByFoxName(name);
        return "redirect:/?username=" + user.getUsername();
    }

    @GetMapping("/trickcenter")
    public String renderTrickCenterPage(@RequestParam (required = false) String name, Model model) {
        if (name == null) {
            return "redirect:/login";
        }
        model.addAttribute("fox", foxService.find(name));
//        model.addAttribute("tricks", Arrays.asList(Tricks.values()));
//        model.addAttribute("tricks", foxService.find(name).isAllTricksAreKnown() ? "You have learned all tricks." : foxService.find(name).notKnownTricks());
        model.addAttribute("tricks",  foxService.getNotKnownTricks(foxService.find(name)));
        model.addAttribute("knowsAll",  foxService.getNotKnownTricks(foxService.find(name)).size());
//        model.addAttribute("tricks",  foxService.find(name).getNotKnownTricks());
//        model.addAttribute("knowsAll",  foxService.find(name).knowsAll());
//        model.addAttribute("active", "trick-center");
        return "trickcenter";
    }

    @PostMapping("/trickcenter")
    public String addTrick(@RequestParam (required = false) String name, @RequestParam String trick, Model model) {
        foxService.addTrickAndRecordChanges(name, trick);
//        foxService.find(name).setTricks(trick.toLowerCase());
        return "redirect:/?name=" + name;
    }

    @GetMapping("/actionhistory")
    public String renderActionHistoryPage(@RequestParam (required = false) String name, Model model) {
        if (name == null) {
            return "redirect:/login";
        }
        model.addAttribute("fox", foxService.find(name));
        model.addAttribute("numOfActions", foxService.find(name).numberOfActions());
        model.addAttribute("actions", foxService.find(name).getActions());
//        model.addAttribute("active", "action-history");
//        model.addAttribute("actionDrink", foxService.getDrinkChange());
//        model.addAttribute("actionTrick", foxService.getTrickChange());
        return "actionhistory";
    }

}

