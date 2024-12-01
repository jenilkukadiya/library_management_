package com.jenil.LibraryManagement.controller;

import com.jenil.LibraryManagement.dto.*;
import com.jenil.LibraryManagement.service.AuthorService;
import com.jenil.LibraryManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String username = userService.addUser(userSaveDTO);
        return "Added Successfully";
    }

    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUser()
    {
        List<UserDTO> allUsers = userService.getAllUser();
        return allUsers;
    }


    @PutMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO)
    {
        String username = userService.updateUser(userUpdateDTO);
        return  username;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")int id)
    {
        String username = userService.deleteUser(id);
        return  "deleteddd";
    }

}
