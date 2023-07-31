package com.jeff.ignitefeed.exceptions;


// Criando uma custom exception
public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(Long id) {
        super("Objeto não encontrado. Id:" + id);
    }
}
