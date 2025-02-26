package com.example.tasklist.domain.user;

import lombok.Data;

@Data//Гетеры сетеры хеш код
public class User {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwoedInfo;
    private Set<Role>roles;
    private List<Task> tasks;


}
