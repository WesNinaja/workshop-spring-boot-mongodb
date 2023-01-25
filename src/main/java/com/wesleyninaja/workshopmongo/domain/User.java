package com.wesleyninaja.workshopmongo.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Para dizermos que essa class corresponde a uma coleção do mongodb que no caso é a coleção user, eu tenho que na class de domínio colocar o @Document
 */
@Document(collection = "user")
public class User implements Serializable {
    @Id
    private String id;
    private String name;
    private String email;

    public User() {
    }

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    //Geramos hashcode e equals para que nossos objetos sejam comparáveis. E por padrão vamos comparar por id.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    //Se vc quer que seus objetos sejam convertidos em bytes pares serem trafegados em rede ou guardado arquivo preciso do Serializeavble
}
