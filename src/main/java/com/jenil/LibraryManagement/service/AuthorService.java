package com.jenil.LibraryManagement.service;

import com.jenil.LibraryManagement.dto.AuthorDTO;
import com.jenil.LibraryManagement.dto.AuthorSaveDTO;
import com.jenil.LibraryManagement.dto.AuthorUpdateDTO;

import java.util.List;

public interface AuthorService {

    String addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthor();

    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

    String deleteAuthor(int id);
}
