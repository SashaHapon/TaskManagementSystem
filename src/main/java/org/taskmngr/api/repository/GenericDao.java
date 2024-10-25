package org.taskmngr.api.repository;

public interface GenericDao <T>{
    T create(T t);
    T read();
    T update();
    T delete();
}
