package com.imemyself.hrworker.Repositories;

import com.imemyself.hrworker.Entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}