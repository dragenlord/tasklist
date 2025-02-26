package com.example.tasklist.domain.task;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
//class что нужно для задачи
@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private List<Status> status;
    private LocalDateTime expirationData;

}
