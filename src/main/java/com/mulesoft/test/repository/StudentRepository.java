package com.mulesoft.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mulesoft.test.entity.Students;

@Repository
public interface StudentRepository extends CrudRepository<Students, Long>{

}
