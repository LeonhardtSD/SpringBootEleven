package com.gaozhaoxi.springbooteleven.serviceImp;

import com.gaozhaoxi.springbooteleven.entity.Person;
import com.gaozhaoxi.springbooteleven.repository.PersonRepository;
import com.gaozhaoxi.springbooteleven.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

/**
 * @author Leon
 */
@Service
public class DemoServiceImp implements DemoService {
    @Autowired
    PersonRepository personRepository;

    @CachePut(value="people",key="#person.id")
    @Override
    public Person save(Person person) {
        Person p=personRepository.save(person);
        System.out.println("为id、key为"+p.getId()+"数据做了缓存");
        return p;
    }


    @CacheEvict(value="people")
    @Override
    public void remove(Long id) {
        System.out.println("删除了id、key为"+id+"的数据缓存");
        Person p=new Person(id);
        personRepository.delete(p);

    }

    @Override
    @Cacheable(value = "people",key="#person.id")
    public Person findOne(Person person) {
        Optional<Person> p = personRepository.findById(person.getId());
        Person person1=p.get();//Optional类用于处理可能出现的空指针，其的get方法获取实际值
        System.out.println("为id、key为" + person1.getId() + "数据做了缓存");
        return person1;
    }
}
