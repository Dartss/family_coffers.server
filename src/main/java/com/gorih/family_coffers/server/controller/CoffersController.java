package com.gorih.family_coffers.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/coffers")
public class CoffersController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getCoffers(ModelMap model) {
        return "Curretn Expanse";
    }
}
