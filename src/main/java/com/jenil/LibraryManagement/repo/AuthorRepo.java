package com.jenil.LibraryManagement.repo;

import com.jenil.LibraryManagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
