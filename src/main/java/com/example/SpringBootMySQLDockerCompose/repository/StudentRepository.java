package com.example.SpringBootMySQLDockerCompose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.SpringBootMySQLDockerCompose.model.Student;


@Repository
@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends JpaRepository<Student,Integer> {

	Student findByRollnumber(int rollnumber);

}
