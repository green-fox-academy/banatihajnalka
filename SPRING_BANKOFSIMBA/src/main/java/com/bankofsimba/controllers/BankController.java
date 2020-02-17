package com.bankofsimba.controllers;

import com.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/show/{name}/details")
    public String getAccountByName(Model model, @PathVariable(name="name") String name) {
        BankAccount account = null;

        for(BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getName().equals(name)) {
                account = bankAccount;
            }
        }

        if (account!= null) {
            model.addAttribute("account", account);
        } else {
            model.addAttribute("error", "No account found");
        }

        return "details";
    }

    @GetMapping("/show/ception")
    public String showCeption(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "ception";
    }

    @GetMapping("/showtable")
    public String showTable(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "showtable";
    }

    @GetMapping("/raise")
    public String raise() {
        return "raise";
    }

    @PostMapping("/raise")
    public String raiseBalance(@RequestParam (required = false) String name) {
//        BankAccount account = (BankAccount) filterAccountsByName(name);
        for (BankAccount account : bankAccounts) {
            if (account.getName().equals(name)) {
                if (account.getIsKing()) {
                    account.setBalance(account.getBalance() + 100);
                } else {
                    account.setBalance(account.getBalance() + 10);
                }
            }
        }
        return "redirect:/showtable";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/add")
    public String addAccount(@RequestParam String name, double balance, String animalType, boolean isKing, boolean isGood) {
        bankAccounts.add(new BankAccount(name, balance, animalType, isKing, isGood));
        return "redirect:/showtable";
    }
}

//        private List<BankAccount> filterAccountsByName (String name){
//            return bankAccounts.stream()
//                    .filter(account -> account.getName().equals(name))
//                    .collect(Collectors.toList());
//        }
//    }
