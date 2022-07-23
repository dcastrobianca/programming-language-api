package com.dev.dcastrobianca.programminglanguageapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgrammingLanguageController {
    
    @Autowired
    private ProgrammingLanguageRepository repository;

    @GetMapping("/languages")
    public List<ProgrammingLanguage> getLanguages(){
        List<ProgrammingLanguage> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")

    public ProgrammingLanguage addLanguage(@RequestBody ProgrammingLanguage language){

        return repository.save(language);
    }

}
