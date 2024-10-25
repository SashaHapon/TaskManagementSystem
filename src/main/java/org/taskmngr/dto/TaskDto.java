package org.taskmngr.dto;

import lombok.Data;
import org.taskmngr.model.Priority;
import org.taskmngr.model.Status;

@Data
public class TaskDto {
    private String taskName;
    private String description;
    private String comments;
    private Priority priority;
    private Status status;
    private AuthorDto author;
    private ExecutorDto executor;
}
