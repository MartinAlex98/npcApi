package org.example.service;

import org.example.model.Npc;
import org.example.repository.NpcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NpcService {


    private NpcRepository npcRepository;

    public NpcService(NpcRepository repository){
        this.npcRepository = repository;
    }

    public List<Npc> getAllNpcs(){
        List<Npc> results = new ArrayList<>();
        Iterable<Npc> npcs = npcRepository.findAll();

        npcs.forEach(results::add);
        return results;
    }
    public void deleteNpc(Long id) {
        npcRepository.deleteById(id);
    }

    public Npc saveNpc(Npc npc) {
        return npcRepository.save(npc);
    }


}
