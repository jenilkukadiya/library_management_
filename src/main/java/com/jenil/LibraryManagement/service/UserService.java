package com.jenil.LibraryManagement.service;

import com.jenil.LibraryManagement.dto.UserDTO;
import com.jenil.LibraryManagement.dto.UserSaveDTO;
import com.jenil.LibraryManagement.dto.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    String deleteUser(int id);
}
