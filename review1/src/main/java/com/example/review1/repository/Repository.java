package com.example.review1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.review1.model.Model;
public interface Repository extends JpaRepository<Model,Integer> {

}