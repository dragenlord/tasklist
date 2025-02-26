package com.example.tasklist.domain.user;

import com.example.tasklist.domain.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data//Гетеры сетеры хеш код
public class User {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwoedInfo;
    private Set<Role> roles;
    private List<Task> tasks;


}
