package com.wesleyninaja.workshopmongo.resources;

import com.wesleyninaja.workshopmongo.domain.User;
import com.wesleyninaja.workshopmongo.dto.UserDTO;
import com.wesleyninaja.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping
    // ResponseEntity vai encapsular toda uma estruturada necessária pra gente retornar respostas http, com possível cabeçalhos, possíveis erros.
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
