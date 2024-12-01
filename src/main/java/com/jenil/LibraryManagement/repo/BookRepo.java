package com.jenil.LibraryManagement.repo;

import com.jenil.LibraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer > {
}
