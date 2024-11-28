package com.ll.domain.wise.service;

import com.ll.domain.wise.entitiy.Wise;
import com.ll.domain.wise.repository.WiseRepository;

import java.util.ArrayList;
import java.util.List;

public class WiseService {
    private final List<Wise> wiseList;
    private  int lastId;
    private final WiseRepository wiseRepository;

    public WiseService(){
        this.lastId = 0;
        this.wiseList = new ArrayList<>();
        this.wiseRepository = new WiseRepository();
    }

    public Wise add(String wise, String author) {
        Wise wises = new Wise(0,wise, author);

        wiseRepository.save(wises);

        return wises;
    }

    public List<Wise> finaAll() {
        return wiseRepository.finaAll();
    }
}
