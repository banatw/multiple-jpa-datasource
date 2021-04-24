package com.example.multiplejpa;

import java.util.UUID;

import com.example.multiplejpa.entity.mysql.Mysql;
import com.example.multiplejpa.entity.postgres.Postgres;
import com.example.multiplejpa.repos.my.Mysqlrepo;
import com.example.multiplejpa.repos.pg.Pgrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleJpaApplication implements CommandLineRunner {
	@Autowired
	private Mysqlrepo mysqlrepo;

	@Autowired
	private Pgrepo pgrepo;

	public static void main(String[] args) {
		SpringApplication.run(MultipleJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		mysqlrepo.save(new Mysql(UUID.randomUUID().toString(), "mysql123"));
		pgrepo.save(new Postgres(UUID.randomUUID().toString(), "postgres123"));
	}

}
