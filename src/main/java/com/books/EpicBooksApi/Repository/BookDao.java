package com.books.EpicBooksApi.Repository;

import com.books.EpicBooksApi.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book,Long> {
}
