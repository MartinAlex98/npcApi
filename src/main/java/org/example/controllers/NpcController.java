package org.example.controllers;

import org.example.model.Npc;
import org.example.service.NpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NpcController {

    @Autowired
    private NpcService npcService;

    @GetMapping("/npcs")
    public List<Npc> getNpcs(){
        List<Npc> npcs = npcService.getAllNpcs();
        return npcs;
    }

    @PostMapping("/npcs")
    public ResponseEntity<Npc> addBook(@RequestBody Npc npc) {
        return new ResponseEntity<>(npcService.saveNpc(npc), HttpStatus.OK);
    }

    @PutMapping("/npcs")
    public ResponseEntity<Npc> editBook(@RequestBody Npc npc) {
        return new ResponseEntity<>(npcService.saveNpc(npc), HttpStatus.OK);
    }

    @DeleteMapping("/npcs")
    public ResponseEntity<Npc> deleteNpc(@PathVariable Long id) {
        npcService.deleteNpc(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
