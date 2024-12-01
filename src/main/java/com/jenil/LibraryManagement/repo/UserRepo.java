package com.jenil.LibraryManagement.repo;

import com.jenil.LibraryManagement.entity.Book;
import com.jenil.LibraryManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer >{
}
