package com.example.CRUDApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form_Controller {
    @RequestMapping("/form")
    public String addData(Model model) {
        return "Add";
    }
}
