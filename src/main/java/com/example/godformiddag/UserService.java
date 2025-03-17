package com.example.godformiddag;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
private static final List<User> users = new ArrayList<>();

public void saveUsers(User user){
    users.add(user);
}

}
