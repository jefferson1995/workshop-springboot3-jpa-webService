package com.barbosaprojects.course.services.exceptions;

/*
    Tratar exceção para deletar o user
 */
public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }
}
