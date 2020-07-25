package org.example.repository;

import org.example.model.Npc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface NpcRepository extends CrudRepository<Npc, Long> {
}
