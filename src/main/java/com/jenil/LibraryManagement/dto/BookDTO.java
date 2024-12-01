package com.jenil.LibraryManagement.dto;

import com.jenil.LibraryManagement.entity.Author;
import com.jenil.LibraryManagement.entity.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {
    private int bookid;
    private String title;
    private Author author;
    private Publisher publisher;
}
