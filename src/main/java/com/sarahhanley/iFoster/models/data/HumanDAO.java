package com.sarahhanley.iFoster.models.data;

import com.sarahhanley.iFoster.models.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HumanDAO extends CrudRepository<Human, Integer> { }
