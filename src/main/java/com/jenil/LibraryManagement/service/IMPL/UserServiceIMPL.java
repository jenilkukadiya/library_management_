package com.jenil.LibraryManagement.service.IMPL;

import com.jenil.LibraryManagement.dto.UserDTO;
import com.jenil.LibraryManagement.dto.UserSaveDTO;
import com.jenil.LibraryManagement.dto.UserUpdateDTO;
import com.jenil.LibraryManagement.entity.User;
import com.jenil.LibraryManagement.repo.UserRepo;
import com.jenil.LibraryManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user = new User(
                userSaveDTO.getName(),
                userSaveDTO.getEmail()
        );
        userRepo.save(user);
        return user.getName();
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> getUsers = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user : getUsers) {
            UserDTO userDTO = new UserDTO(
                    user.getUserid(),
                    user.getName(),
                    user.getEmail()
            );
            userDTOList.add(userDTO);
        }

        return userDTOList;
    }

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {
        if (userRepo.existsById(userUpdateDTO.getUserid())) {
            User user = userRepo.getById(userUpdateDTO.getUserid());
            user.setName(userUpdateDTO.getName());
            user.setEmail(userUpdateDTO.getEmail());
            userRepo.save(user);
            return user.getName();
        } else {
            System.out.println("User ID Not Exist!!!!!!!!");
        }
        return null;
    }

    @Override
    public String deleteUser(int id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        } else {
            System.out.println("ID Not Found");
        }
        return null;

    }

}
