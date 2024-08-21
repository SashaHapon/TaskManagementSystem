package org.taskmngr;

import org.taskmngr.model.Author;
import org.taskmngr.model.Status;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Status process = Status.Process;
        System.out.println("Hello world!");
        author.getUsername();
    }
}