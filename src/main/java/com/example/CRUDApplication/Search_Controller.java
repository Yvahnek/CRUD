package com.example.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Search_Controller {
    @Autowired
    private GameRepository gameRepo;

    @RequestMapping("/search")
    public String search(@RequestParam("developer") String developer, Model model){
        model.addAttribute("game", gameRepo.findAllBydeveloper(developer));
        return "Show";
    }
}
