package com.ll.domain.wise.repository;

import com.ll.domain.wise.entitiy.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseRepository {
    private final List<WiseSaying> wiseSayingList;
    private  int lastId;


    public WiseRepository(){
        this.lastId = 0;
        this.wiseSayingList = new ArrayList<>();
    }

    public WiseSaying save(WiseSaying wiseSaying) {
        wiseSaying.setId(++lastId);
        wiseSayingList.add(wiseSaying);
        return wiseSaying;
    }

    public List<WiseSaying> findAll() {
        return wiseSayingList;
    }

    public boolean deleteById(int id) {
        return wiseSayingList.removeIf(wiseSaying -> wiseSaying.getId() == id);
    }
}
