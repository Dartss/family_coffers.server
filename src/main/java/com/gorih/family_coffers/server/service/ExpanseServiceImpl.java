package com.gorih.family_coffers.server.service;

import com.gorih.family_coffers.server.entity.Expanse;
import com.gorih.family_coffers.server.repository.ExpanseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpanseServiceImpl implements ExpanseService {

    @Autowired
    private ExpanseRepository repository;

    public List<Expanse> getAll() {
        return repository.findAll();
    }

    public Expanse getByID(long id) {
        return repository.findOne(id);
    }

    public Expanse save(Expanse expanse) {
        return repository.save(expanse);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
