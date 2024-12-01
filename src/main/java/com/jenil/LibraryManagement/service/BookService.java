package com.jenil.LibraryManagement.service;

import com.jenil.LibraryManagement.dto.BookDTO;
import com.jenil.LibraryManagement.dto.BookSaveDTO;
import com.jenil.LibraryManagement.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);
    List<BookDTO> getAllBook();
    String updateBook(BookUpdateDTO bookUpdateDTO);
    String deleteBook(int id);
}
