package org.example.entity;

import lombok.*;

import java.util.UUID;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

    private Long id;
    private String login;
    private String password;
    private Integer age;

}
