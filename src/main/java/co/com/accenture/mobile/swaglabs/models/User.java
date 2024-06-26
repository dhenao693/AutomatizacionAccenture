package co.com.accenture.mobile.swaglabs.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String postalCode;
}
