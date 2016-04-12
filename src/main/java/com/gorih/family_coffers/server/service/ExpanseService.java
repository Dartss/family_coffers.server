package com.gorih.family_coffers.server.service;

import com.gorih.family_coffers.server.entity.Expanse;

import java.security.interfaces.ECKey;
import java.util.List;

public interface ExpanseService {

    List<Expanse> getAll();
    Expanse getByID(long id);
    Expanse save(Expanse expanse);
    void remove(long id);
}
