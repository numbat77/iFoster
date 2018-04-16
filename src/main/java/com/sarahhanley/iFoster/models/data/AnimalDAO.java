package com.sarahhanley.iFoster.models.data;

import com.sarahhanley.iFoster.models.Animal;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AnimalDAO extends CrudRepository<Animal, Integer> { }
