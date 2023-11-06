package it.mozie.viewexercise.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/messaggioconmodel")
    public String passParametersWith(Model model){
        Map<String, String> map = new HashMap<>();
        map.put("spring","mvc");
        model.addAttribute("message","messaggio con model");
        model.mergeAttributes(map);
        return "response/message";
    }
}
