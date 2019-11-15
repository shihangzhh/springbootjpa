package xynu.shihang.springbootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xynu.shihang.springbootjpa.bean.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{


}
