package com.example.demo.controller;


import com.example.demo.entity.Team;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")

public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping
    private List<Team> getAll(){
        return teamService.getAll();
    }

    @GetMapping("/{id}")
    private Team getById(@PathVariable int id){
        return teamService.getById(id);
    }

    @PostMapping
    private Team add(@RequestBody Team team){
        return teamService.addOrUpdate(team);
    }

    @PutMapping("/{id")
    private Team update(@PathVariable int id,@RequestBody Team team){
        team.setTid(id);
        return teamService.addOrUpdate(team);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
        teamService.deleteById(id);
    }
}
