package com.example.multiplejpa.repos.pg;

import com.example.multiplejpa.entity.postgres.Postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface Pgrepo extends JpaRepository<Postgres, String> {

}
