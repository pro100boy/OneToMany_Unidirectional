package com.java2s.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PersonDaoImpl {
    public void test() {

        Professor emp = new Professor();
        emp.setName("name");
        emp.setSalary(12345);


        Phone p = new Phone();
        p.setNumber("1234509876");
        p.setType("cellular");

        emp.addPhone(p);
        em.persist(p);
        em.persist(emp);
    }

    @PersistenceContext
    private EntityManager em;
}
