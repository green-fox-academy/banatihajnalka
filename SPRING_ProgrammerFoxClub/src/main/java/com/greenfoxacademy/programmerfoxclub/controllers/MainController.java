package com.greenfoxacademy.programmerfoxclub.controllers;

        import com.greenfoxacademy.programmerfoxclub.modles.Drink;
        import com.greenfoxacademy.programmerfoxclub.modles.Food;
        import com.greenfoxacademy.programmerfoxclub.services.FoxService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;

        import java.util.Arrays;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String showMain(Model model, @RequestParam (required = false) String name) {
        if (name == null) {
            return "index";
        } else {
            model.addAttribute("fox", foxService.find(name));
            model.addAttribute("toString", foxService.find(name).toString());
            model.addAttribute("numOfTricks", foxService.find(name).getNumberOfTricks());
        }
        return "index";
    }
    // /login?error=noname
    @GetMapping("/login")
    public String renderMain(@RequestParam (required=false) String name, Model model, @RequestParam(required = false) String error) {
        if (!(error == null)) {
            model.addAttribute("error", "You have provided a name that has not been used before, add it as a new one!");
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, Model model) {
        if (foxService.isExists(name)) {
            return "redirect:/?name=" + name;
        } else {
            foxService.add(name);
            return "redirect:/?name=" + name;
        }
    }

    @GetMapping("/nutritionstore")
    public String renderNutritionStorePage(@RequestParam (required = false) String name, Model model) {
        if (name == null) {
            return "redirect:/login";
        }
        model.addAttribute("fox", foxService.find(name));
        model.addAttribute("foods", Arrays.asList(Food.values()));
        model.addAttribute("drinks", Arrays.asList(Drink.values()));
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String addFoodAndDrink(@RequestParam (required = false) String name,  @RequestParam String food, @RequestParam String drink, Model model) {
        foxService.find(name).setFood(food.toLowerCase());
        foxService.find(name).setDrink(drink.toLowerCase());
        return "redirect:/?name=" + name;
    }
}
