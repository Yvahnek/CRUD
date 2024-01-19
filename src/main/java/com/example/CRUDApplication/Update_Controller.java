package com.example.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Update_Controller {
    @Autowired
    private GameRepository gameRepo;

    @RequestMapping("/update")
    public String update(
        @RequestParam("id") Integer id,
        @RequestParam("name") String name,
        @RequestParam("release") String release,
        @RequestParam("developer") String developer,
        Model model
    ) throws Exception {
        Game game = new Game(id, name, release, developer, true);
        System.out.println(game);
        gameRepo.save(game);
        model.addAttribute("game", gameRepo.findAll());
        return "Show";
    }

}
