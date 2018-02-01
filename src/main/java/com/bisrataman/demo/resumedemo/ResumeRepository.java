package com.bisrataman.demo.resumedemo;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ResumeRepository extends CrudRepository<Resume,Long> {

    Iterable<Resume>findAllByName(String search);
}





