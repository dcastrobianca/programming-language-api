package com.dev.dcastrobianca.programminglanguageapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgrammingLanguageRepository extends MongoRepository<ProgrammingLanguage, String>{
    
}
