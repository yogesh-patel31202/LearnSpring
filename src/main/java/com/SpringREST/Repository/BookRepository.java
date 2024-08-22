package com.SpringREST.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringREST.Model.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {
}

