package com.jenil.LibraryManagement.controller;


import com.jenil.LibraryManagement.dto.BookDTO;
import com.jenil.LibraryManagement.dto.BookSaveDTO;
import com.jenil.LibraryManagement.dto.BookUpdateDTO;
import com.jenil.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping(path = "/save")
    public String saveBook(@RequestBody BookSaveDTO bookSaveDTO)
    {
        String booktitle = bookService.addBook(bookSaveDTO);
        return  "Added Successfully";
    }
    @GetMapping(path = "/getAllBook")
    public List<BookDTO> getAllBook()
    {
        List<BookDTO> allBooks = bookService.getAllBook();
        return allBooks;
    }
    @PutMapping(path = "/update")
    public String updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        String bookname = bookService.updateBook(bookUpdateDTO);
        return  bookname;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBook(@PathVariable(value = "id")int id)
    {
        String Bookname = bookService.deleteBook(id);
        return  "deleteddd";
    }



}
