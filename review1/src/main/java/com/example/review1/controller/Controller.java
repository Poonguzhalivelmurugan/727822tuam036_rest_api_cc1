package com.example.review1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.Model;
import com.example.review1.service.Sservices;


@RestController
public class Controller {
    @Autowired
    Sservices ev;
    @PostMapping("/post/event")
    public ResponseEntity<Model>addelements(@RequestBody Model m)
    {
        Model evt=ev.create(m);
        return new ResponseEntity<>(evt,HttpStatus.CREATED);
    }
    @GetMapping("/get/event")
    public ResponseEntity<List<Model>> showinfo()
    {
        return new ResponseEntity<>(ev.getAll(),HttpStatus.OK);
    }
    @GetMapping("/get/event/{eid}")
    public ResponseEntity<Model> getById(@PathVariable Integer eid)
    {
        Model obj=ev.getId(eid);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/put/{eid}")
    public ResponseEntity<Model> putMethodName(@PathVariable("eid") int eid, @RequestBody Model e) {
        if(ev.update(eid,e) == true)
        {
            return new ResponseEntity<>(e,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/delete/{eid}")
    public ResponseEntity<Boolean> delete(@PathVariable("eid") int eid)
    {
        if(ev.delete(eid) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
   
}