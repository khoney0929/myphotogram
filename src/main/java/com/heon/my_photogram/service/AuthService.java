package com.heon.my_photogram.service;

import com.heon.my_photogram.domain.user.User;
import com.heon.my_photogram.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public User signUp(User user){
        String rawPassword=user.getPassword();
        String encPassword= bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);

        user.setRole("ROLE_USER");

        User userEntity = userRepository.save(user);
        return userEntity;
    }

}
