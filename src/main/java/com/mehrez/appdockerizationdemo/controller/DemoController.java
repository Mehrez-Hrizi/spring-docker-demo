package com.mehrez.appdockerizationdemo.controller;

import com.mehrez.appdockerizationdemo.entity.DemoEntity;
import com.mehrez.appdockerizationdemo.repository.DemoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo/")
public class DemoController {

    private final DemoRepository repository;

    public DemoController(DemoRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save(@RequestBody DemoEntity demoEntity) {
        repository.save(demoEntity);
        return ResponseEntity.ok("saved successfully");
    }

    @GetMapping(value = "find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DemoEntity> findById(@PathVariable Integer id) {
        DemoEntity entity = repository.findById(id).orElseThrow();
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @GetMapping(value = "find/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DemoEntity>> findAll() {
        List<DemoEntity> entities = repository.findAll();
        return ResponseEntity.ok(entities);
    }
}
