package org.taskmngr.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import lombok.RequiredArgsConstructor;
import org.taskmngr.api.repository.GenericDao;

@RequiredArgsConstructor
public abstract class AbstractDao<T> implements GenericDao<T> {
    private final Class<T> entityClass;

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

    @Override
    public T create(T t) {
        entityManager.persist(t);
        return t;
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
