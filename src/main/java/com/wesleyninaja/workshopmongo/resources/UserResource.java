package com.wesleyninaja.workshopmongo.resources;

import com.wesleyninaja.workshopmongo.domain.User;
import com.wesleyninaja.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping
    // ResponseEntity vai encapsular toda uma estruturada necessária pra gente retornar respostas http, com possível cabeçalhos, possíveis erros.
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

}
