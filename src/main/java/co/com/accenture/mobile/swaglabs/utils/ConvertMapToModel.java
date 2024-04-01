package co.com.accenture.mobile.swaglabs.utils;


import co.com.accenture.mobile.swaglabs.models.User;

import java.util.Map;

public class ConvertMapToModel {
    public static User convertMapToUser(Map<String, String> map) {
        return User.builder()
                .username(map.get("username"))
                .password(map.get("password"))
                .build();
    }
}
