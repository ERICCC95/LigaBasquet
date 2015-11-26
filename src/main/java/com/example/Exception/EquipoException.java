package com.example.Exception;

/**
 * Created by jhipster on 11/11/15.
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException {
    public EquipoException(Long id) {
        super("NO EXIST DEVELOPER WITH ID: " + id);
    }
}
