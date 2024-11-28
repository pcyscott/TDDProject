package com.ll.domain.wise.service;

import com.ll.domain.wise.entitiy.Wise;

import java.util.ArrayList;
import java.util.List;

public class WiseService {
    private final List<Wise> wiseList;
    private  int lastId;
    public WiseService(){
        this.lastId = 0;
        this.wiseList = new ArrayList<>();
    }

    public Wise add(String wise, String author) {
        Wise wises = new Wise(++lastId, wise, author);
        wiseList.add(wises);
        return wises;

    }

    public List<Wise> finaAll() {
        return wiseList;
    }
}
