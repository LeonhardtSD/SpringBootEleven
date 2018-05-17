package com.gaozhaoxi.springbooteleven.repository;

import com.gaozhaoxi.springbooteleven.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Leon
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

}
