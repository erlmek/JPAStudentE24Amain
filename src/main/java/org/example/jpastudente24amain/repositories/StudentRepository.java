package org.example.jpastudente24amain.repositories;

import org.example.jpastudente24amain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String lastName);

}

