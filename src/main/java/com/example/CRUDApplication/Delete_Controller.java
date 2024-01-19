package com.example.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Delete_Controller {
    @Autowired
    private GameRepository gameRepo;

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") Integer id, Model model){
        gameRepo.deleteById(id);
        model.addAttribute("games", gameRepo.findAll());

        return "Show";
    }
}
