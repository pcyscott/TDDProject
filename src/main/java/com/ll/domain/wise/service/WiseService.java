package com.ll.domain.wise.service;

import com.ll.domain.wise.entitiy.WiseSaying;
import com.ll.domain.wise.repository.WiseRepository;

import java.util.ArrayList;
import java.util.List;

public class WiseService {
    private final WiseRepository wiseRepository;

    public WiseService(){
        this.wiseRepository = new WiseRepository();
    }

    public WiseSaying add(String wise, String author) {
        WiseSaying wises = new WiseSaying(0,wise, author);
        wiseRepository.save(wises);
        return wises;
    }

    public List<WiseSaying> findAll() {
        return wiseRepository.findAll();
    }

    public boolean deleteById(int id) {
        return wiseRepository.deleteById(id);
    }
}
