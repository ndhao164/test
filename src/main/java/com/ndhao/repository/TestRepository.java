package com.ndhao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndhao.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}
