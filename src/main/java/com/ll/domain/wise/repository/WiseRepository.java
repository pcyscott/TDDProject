package com.ll.domain.wise.repository;

import com.ll.domain.wise.entitiy.Wise;

import java.util.ArrayList;
import java.util.List;

public class WiseRepository {
    private final List<Wise> wiseList;
    private  int lastId;


    public WiseRepository(){
        this.lastId = 0;
        this.wiseList = new ArrayList<>();
    }

    public Wise save(Wise wise) {
        wise.setId(++lastId);
        wiseList.add(wise);
        return wise;
    }

    public List<Wise> finaAll() {
        return wiseList;
    }
}
