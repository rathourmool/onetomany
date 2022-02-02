package com.example.demo.controller;


import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    private List<Player> getAll(){
        return playerService.getAll();
    }

    @GetMapping("/{id}")
    private Player getById(@PathVariable int id){
        return playerService.getById(id);
    }

    @PostMapping
    private Player add(@RequestBody Player player){
        return playerService.addOrUpdate(player);
    }

    @PutMapping("/{id")
    private Player update(@PathVariable int id,@RequestBody Player player){
        player.setPid(id);
        return playerService.addOrUpdate(player);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
        playerService.deleteById(id);
    }

}
