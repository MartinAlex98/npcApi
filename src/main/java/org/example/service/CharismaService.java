package org.example.service;

import org.example.model.Charisma;
import org.example.repository.CharismaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CharismaService {
    @Autowired
    private CharismaRepository charismaRepository;

    public List<Charisma> getCharisma(){
        List<Charisma> results = new ArrayList<>();
        Iterable<Charisma> charismas= charismaRepository.findAll();

        charismas.forEach(results::add);
        return results;
    }
}
