package com.example.demo.service;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    public Player addOrUpdate(Player player){
        return playerRepository.save(player);
    }

    public boolean deleteById(int id){
        playerRepository.deleteById(id);
        return true;
    }

    public List<Player> getAll(){
        return playerRepository.findAll();
    }
    public Player getById(int id){
        return playerRepository.findById(id).get();
    }
}
