package com.example.demo.service;

import com.example.demo.entity.Player;
import com.example.demo.entity.Team;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;
    public Team addOrUpdate(Team team){
        return teamRepository.save(team);
    }

    public boolean deleteById(int id){
        teamRepository.deleteById(id);
        return true;
    }

    public List<Team> getAll(){
        return teamRepository.findAll();
    }
    public Team getById(int id){
        return teamRepository.findById(id).get();
    }
}
