package org.taskmngr.api.service;

import org.taskmngr.dto.TaskDto;

public interface TaskService {
    TaskDto create(TaskDto taskDto);

    TaskDto read(int id);

    TaskDto readAll(int id);

    TaskDto update(TaskDto taskDto);

    void delete(int id);
}
