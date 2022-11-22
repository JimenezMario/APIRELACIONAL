package com.Api_bilibliote_bidireccional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Api_bilibliote_bidireccional.Entitys.Books;

public interface LibroRepository extends JpaRepository<Books, Integer> {

}
