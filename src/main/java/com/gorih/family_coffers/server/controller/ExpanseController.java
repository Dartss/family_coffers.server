package com.gorih.family_coffers.server.controller;

import com.gorih.family_coffers.server.entity.Expanse;
import com.gorih.family_coffers.server.repository.ExpanseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpanseController {

    @Autowired
    private ExpanseRepository expanseRepository;

    @RequestMapping(value = "/coffers", method = RequestMethod.GET)
    @ResponseBody
    public List<Expanse> getAllExpanse() {
        return expanseRepository.findAll();
    }

    @RequestMapping(value = "/coffers/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Expanse getExpanse(@PathVariable("id") long coffersID) {
        return expanseRepository.findOne(coffersID);
    }

    @RequestMapping(value = "/coffers", method = RequestMethod.POST)
    @ResponseBody
    public Expanse saveExpanse(@RequestBody Expanse expanse) {
        return expanseRepository.saveAndFlush(expanse);
    }

    @RequestMapping(value = "/coffers/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable long id) {
        expanseRepository.delete(id);
    }

}
