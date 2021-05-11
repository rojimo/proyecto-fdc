package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

	List<Project> findAll();

}
