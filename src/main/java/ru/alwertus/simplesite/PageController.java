package ru.alwertus.simplesite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
}
