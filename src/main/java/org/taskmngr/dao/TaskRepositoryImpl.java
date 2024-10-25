package org.taskmngr.dao;

import org.springframework.stereotype.Repository;
import org.taskmngr.api.repository.TaskRepository;
import org.taskmngr.model.Task;

@Repository
public class TaskRepositoryImpl extends AbstractDao<Task> implements TaskRepository {
    public TaskRepositoryImpl() {
        super(Task.class);
    }
}
