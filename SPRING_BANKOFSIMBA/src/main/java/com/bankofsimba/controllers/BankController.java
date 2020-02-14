package com.bankofsimba.controllers;

import com.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccounts;

    public BankController() {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        bankAccounts.add(new BankAccount("Nala", 400, "lion", false, true));
        bankAccounts.add(new BankAccount("Pumba", 200, "warthog", false, true));
        bankAccounts.add(new BankAccount("Scar", 1000, "lion", false, false));
        bankAccounts.add(new BankAccount("Shenzi", 800, "hyena", false, false));
    }

    @GetMapping("/show")
    public String showFields(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "show";
    }

}
