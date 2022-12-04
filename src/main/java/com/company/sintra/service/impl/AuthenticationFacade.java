package com.company.sintra.service.impl;

import com.company.sintra.service.IAuthenticationFacade;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationFacade implements IAuthenticationFacade {
    @Override
    public Authentication getAuthentication() {

                return SecurityContextHolder.getContext().getAuthentication();
    }
}
