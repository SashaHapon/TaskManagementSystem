package org.taskmngr.dao;

import lombok.RequiredArgsConstructor;
import org.taskmngr.api.repository.GenericDao;

@RequiredArgsConstructor
public abstract class AbstractDao<T> implements GenericDao<T> {
    private final Class<T> entityClass;

    @Override
    public T create() {
        return null;
    }

    @Override
    public T read() {
        return null;
    }

    @Override
    public T update() {
        return null;
    }

    @Override
    public T delete() {
        return null;
    }
}
