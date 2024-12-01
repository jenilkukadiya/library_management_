package com.jenil.LibraryManagement.repo;

import com.jenil.LibraryManagement.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer > {
}
