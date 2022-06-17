package com.fleet.fleetcheck.security.registration;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class RegistrationRequest {

    private  String name;
    private  String employeeId;
    private String password;


}
