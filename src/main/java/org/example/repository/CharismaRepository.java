package org.example.repository;

import org.example.model.Charisma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CharismaRepository extends CrudRepository<Charisma,Long> {
}
