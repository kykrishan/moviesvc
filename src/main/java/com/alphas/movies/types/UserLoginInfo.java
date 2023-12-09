package com.alphas.movies.types;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@Getter
@Setter
public class UserLoginInfo {
    private String userName;
    private String securityHashCode;
}
