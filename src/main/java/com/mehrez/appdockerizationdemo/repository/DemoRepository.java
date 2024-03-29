package com.mehrez.appdockerizationdemo.repository;

import com.mehrez.appdockerizationdemo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {
}
