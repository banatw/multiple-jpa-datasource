package com.example.multiplejpa.repos.my;

import com.example.multiplejpa.entity.mysql.Mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Mysqlrepo extends JpaRepository<Mysql, String> {

}
