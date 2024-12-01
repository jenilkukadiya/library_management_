package com.jenil.LibraryManagement.dto;

import com.jenil.LibraryManagement.entity.Book;
import com.jenil.LibraryManagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowDTO {

    private int id;
    private Book book_id;
    private User user_id;
    private LocalDate borrowDate;
    private LocalDate returnDate;


}
