package com.bway.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.SpringDemo.model.Employ;

public interface EmployRepository extends JpaRepository<Employ, Integer> {

}
