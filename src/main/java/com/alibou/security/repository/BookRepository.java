package com.alibou.security.repository;

import com.alibou.security.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  BookRepository extends JpaRepository<Book, Integer> {
}
