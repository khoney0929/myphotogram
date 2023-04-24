package com.heon.my_photogram.web;

import com.heon.my_photogram.config.auth.PrincipalDetails;
import com.heon.my_photogram.domain.user.User;
import com.heon.my_photogram.service.AuthService;
import com.heon.my_photogram.web.dto.auth.SignupDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor // final이 걸린 애들을 생성자로 만들어줌
@Controller
public class AuthController {


    private final AuthService authService;

    @GetMapping("/auth/signin")
    public String signInForm(){

        return "auth/signin";
    }

    @GetMapping("/auth/signup")
    public String signUpForm(){

        return "auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signUp(SignupDto signupDto){
        User user=signupDto.toEntity();
        User userEntity = authService.signUp(user);
        return "auth/signin";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/user/{id}")
    public String profile(@PathVariable int id){
        return "/profile";
    }

    @GetMapping("/user/{id}/update")
    public String update(@PathVariable int id, @AuthenticationPrincipal PrincipalDetails principalDetails, Model model){
        model.addAttribute("principal",principalDetails.getUser());
        return "/update";
    }



}
