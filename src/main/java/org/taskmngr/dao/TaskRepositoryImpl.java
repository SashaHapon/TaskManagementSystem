package org.taskmngr.dao;

import org.taskmngr.api.repository.TaskRepository;
import org.taskmngr.model.Task;

public class TaskRepositoryImpl extends AbstractDao<Task> implements TaskRepository {
    public TaskRepositoryImpl() {
        super(Task.class);
    }
}
