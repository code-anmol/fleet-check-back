package com.fleet.fleetcheck.security.registration;

import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    public String register(RegistrationRequest request){
        return  "works";
    }

}
