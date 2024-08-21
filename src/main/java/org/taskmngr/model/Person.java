package org.taskmngr.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    int id;
    String username;
    private char password;
}
