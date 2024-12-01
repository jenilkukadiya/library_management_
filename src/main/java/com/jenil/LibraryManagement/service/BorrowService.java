package com.jenil.LibraryManagement.service;

import com.jenil.LibraryManagement.dto.BorrowDTO;
import com.jenil.LibraryManagement.dto.BorrowSaveDTO;
import com.jenil.LibraryManagement.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {

    String addBorrow(BorrowSaveDTO borrowSaveDTO);

    List<BorrowDTO> getAllBorrow();

    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);

}
