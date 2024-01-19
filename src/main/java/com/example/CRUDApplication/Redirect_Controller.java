package com.example.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Redirect_Controller {
    @Autowired
    private GameRepository gameRepo;

    @RequestMapping("/redirect")
    public String redirect(
        @RequestParam("id") Integer id,
        Model model
    ) throws Exception {
        System.out.println(gameRepo.findById(id));
        model.addAttribute("game", gameRepo.findById(id));
        return "Update";
    }
}
