package com.example.CRUDApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Home_Controller {
    @RequestMapping("/")
    public String home() {
        return "Home";
    }
}
