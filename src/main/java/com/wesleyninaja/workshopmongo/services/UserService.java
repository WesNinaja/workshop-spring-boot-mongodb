package com.wesleyninaja.workshopmongo.services;

import com.wesleyninaja.workshopmongo.domain.User;
import com.wesleyninaja.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //Instanciar um objeto do tipo userRepository
    //Quando usamos o autowired o próprio spring vai procurar a definição desse objeto que no caso é UserRepository e vai instanciar o objeto ali.
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
