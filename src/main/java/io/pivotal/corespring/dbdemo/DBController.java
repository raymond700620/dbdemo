package io.pivotal.corespring.dbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    DBService service;
    DBController(DBService service) {
        this.service = service;
    }
    @GetMapping("/examCode/{id}")
    public String getExamCode(@PathVariable int id) {
        return service.getExamCode(id);
    }

}
