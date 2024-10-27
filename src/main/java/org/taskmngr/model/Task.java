package org.taskmngr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Task {
    private String taskName;
    private String description;
    private String comments;
    private Priority priority;
    private Status status;

}
