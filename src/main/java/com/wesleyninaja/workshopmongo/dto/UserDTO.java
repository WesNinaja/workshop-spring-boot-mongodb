package com.wesleyninaja.workshopmongo.dto;

import com.wesleyninaja.workshopmongo.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    //Vamos criar também um construtor cobrecarregado do userDTO recebendo como argumento um objeto do tipo User para eu ter uma forma automatizada de instanciar um userDTO a partir de User
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
