package org.taskmngr.api.repository;

public interface GenericDao <T>{
    T create();
    T read();
    T update();
    T delete();
}
