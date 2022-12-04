package com.company.sintra.controller;


import com.company.sintra.dto.UserRegisterRequest;
import com.company.sintra.dto.UserRegisterResponse;
import com.company.sintra.service.IAuthenticationFacade;
import com.company.sintra.service.impl.AuthenticationFacade;
import com.company.sintra.service.impl.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final AuthenticationFacade authenticationFacade;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody UserRegisterRequest userRegisterRequest) {
        userService.register(userRegisterRequest);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UserRegisterResponse login(@RequestBody UserRegisterRequest userRegisterRequest){
        return userService.login(userRegisterRequest);
    }
    @RequestMapping(value = "/username", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    @JsonFormat
    public ResponseEntity< Authentication>  currentUserNameSimple() {
        Authentication authentication = authenticationFacade.getAuthentication();
        return ResponseEntity.ok( authentication);
    }



}
