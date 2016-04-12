package com.gorih.family_coffers.server.controller;

import com.gorih.family_coffers.server.entity.Expanse;
import com.gorih.family_coffers.server.repository.ExpanseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coffers")
public class CoffersController {

    @Autowired
    private ExpanseRepository expanseRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Expanse getCoffers() {
        List<Expanse> list = expanseRepository.findAll();
        return createMockExpanse();
    }

    private Expanse createMockExpanse() {
        Expanse expanse = new Expanse();
        expanse.setId(1);
        expanse.setCategory("Food");
        expanse.setValue(15);
        expanse.setDate(1515155151);

        return expanse;
    }
}
