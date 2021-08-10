package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FooBarRepository extends JpaRepository<FooBar, FooBarId> {

}
