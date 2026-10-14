package org.generation.marify.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ResponseRequest (
    String token
){

}
