package com.example.review1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.review1.repository.Repository;
import com.example.review1.model.Model;
@Service
public class Sservices {
     @Autowired
     Repository ev;
     public Model create(Model e){
      return ev.save(e);
     }
     public List<Model> getAll(){
      return ev.findAll();
     }
     public Model getId(int eid){
      return ev.findById(eid).orElse(null);
     }
     public boolean update(int eid,Model ee){
          if(this.getId(eid)==null)
          {
              return false;
          }
          try{
              ev.save(ee);
          }
          catch(Exception ex)
          {
              return false;
          }
          return  true;
     }
     public boolean delete(int eid){
          if(this.getId(eid)==null){
             return false;
          }
          ev.deleteById(eid);
          return true;
     }
}