package com.pivotSoftware.apiBase.repository;

import com.pivotSoftware.apiBase.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  BookRepository extends JpaRepository<Book, Integer> {
}
