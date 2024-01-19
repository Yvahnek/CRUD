package com.example.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show_Controller {
    @Autowired
    private GameRepository gameRepo;

    @RequestMapping("/show")
    public String show(Model model) {
        for (Game game : gameRepo.findAll()) {
            System.out.println(game);
        }

        model.addAttribute("game", gameRepo.findAll());
        return "Show";
    }
}
