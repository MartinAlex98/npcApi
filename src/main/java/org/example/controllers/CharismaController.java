package org.example.controllers;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.example.model.Charisma;
import org.example.service.CharismaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharismaController {

    @Autowired
    private CharismaService charismaService;

    @GetMapping("/charisma")
    public List<Charisma> getCharisma(){
        List<Charisma> charismas = charismaService.getCharisma();
        return charismas;
    }

}
