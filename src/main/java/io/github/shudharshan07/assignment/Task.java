package io.github.shudharshan07.assignment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    String title;
    String task;
    LocalTime created_time;
    LocalTime updated_time;

    public Task(String title, String task, LocalTime created_time) {
        this.title = title;
        this.task = task;
        this.created_time = created_time;
    }
}
