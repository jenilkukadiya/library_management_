package com.jenil.LibraryManagement.service.IMPL;

import com.jenil.LibraryManagement.dto.BookDTO;
import com.jenil.LibraryManagement.dto.BookSaveDTO;
import com.jenil.LibraryManagement.dto.BookUpdateDTO;
import com.jenil.LibraryManagement.entity.Author;
import com.jenil.LibraryManagement.entity.Book;
import com.jenil.LibraryManagement.entity.Publisher;
import com.jenil.LibraryManagement.repo.AuthorRepo;
import com.jenil.LibraryManagement.repo.BookRepo;
import com.jenil.LibraryManagement.repo.PublisherRepo;
import com.jenil.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BookServiceIMPL implements BookService {

    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private PublisherRepo publisherRepo;
    @Autowired
    private BookRepo bookRepo;
    @Override
    public String addBook(BookSaveDTO bookSaveDTO) {



        Author author = authorRepo.findById(bookSaveDTO.getAuthor_id())
                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + bookSaveDTO.getAuthor_id()));

        Publisher publisher = publisherRepo.findById(bookSaveDTO.getPublisher_id())
                .orElseThrow(() -> new RuntimeException("Publisher not found with ID: " + bookSaveDTO.getPublisher_id()));

        Book book = new Book(
                bookSaveDTO.getTitle(),
                author,
                publisher
        );
        bookRepo.save(book);
        return book.getTitle();
    }

    @Override
    public List<BookDTO> getAllBook() {
        List<Book> getBooks = bookRepo.findAll();
        List<BookDTO> bookDTOList = new ArrayList<>();
        for(Book book : getBooks)
        {
            BookDTO bookDTO = new BookDTO(
                    book.getBookid(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublisher()
            );
            bookDTOList.add(bookDTO);
        }
        return bookDTOList;
    }

    @Override
    public String updateBook(BookUpdateDTO bookUpdateDTO) {
        if(bookRepo.existsById(bookUpdateDTO.getBookid())) {
            Book book = bookRepo.getById(bookUpdateDTO.getBookid());
            book.setTitle(bookUpdateDTO.getTitle());
            book.setAuthor(authorRepo.getById(bookUpdateDTO.getAuthor_id()));
            book.setPublisher(publisherRepo.getById(bookUpdateDTO.getPublisher_id()));
            bookRepo.save(book);
            return book.getTitle();
        }
        else
        {
            System.out.println("Book ID Not Found");
        }
        return null;
    }

    @Override
    public String deleteBook(int id) {
        if(bookRepo.existsById(id))
        {
            bookRepo.deleteById(id);
        }
        else
        {
            System.out.println("Book ID Not Found");
        }
        return null;
    }

}
