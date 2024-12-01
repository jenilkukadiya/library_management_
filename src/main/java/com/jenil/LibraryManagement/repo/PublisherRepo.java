package com.jenil.LibraryManagement.repo;

import com.jenil.LibraryManagement.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer > {
}
