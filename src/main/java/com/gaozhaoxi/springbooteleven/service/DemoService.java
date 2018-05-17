package com.gaozhaoxi.springbooteleven.service;

import com.gaozhaoxi.springbooteleven.entity.Person;

/**
 * @author Leon
 */
public interface DemoService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}
