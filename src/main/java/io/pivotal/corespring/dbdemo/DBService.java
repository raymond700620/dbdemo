package io.pivotal.corespring.dbdemo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DBService {

    DBRepository repo;
    public DBService(DBRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public String getExamCode(int id) {
        return repo.getExamCode(id);
        //return "hello from service "+id;
    }
}
