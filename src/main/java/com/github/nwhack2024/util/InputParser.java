package com.github.nwhack2024.util;

import com.github.nwhack2024.domain.entity.User;

public class InputParser {
    public static User parseInput(User user){
        user.setUid(null);
        user.setCreationDate(null);
        user.setLatestLogin(null);
        user.setUserLevel(null);
        return user;
    }

}
