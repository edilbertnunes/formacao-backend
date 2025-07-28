package models.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.With;
import models.enums.ProfileEnum;

import java.util.Set;

public record CreateUserRequest (
        @Schema(description = "User name", example = "Edilbert Nunes")
        @NotBlank(message = "Name cannot be empty")
        @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
        String name,

        @Schema(description = "User email", example = "edilbert@example.com")
        @Email(message = "Invalid email")
        @NotBlank(message = "email cannot be empty")
        @Size(min = 6, max = 50, message = "email must be between 6 and 50 characters")
        String email,

        @Schema(description = "User password", example = "123456")
        @Size(min = 6, max = 50, message = "password must be between 6 and 50 characters")
        @NotBlank(message = "password cannot be empty")
        String password,

        @Schema(description = "User profiles", example = "[\"ROLE_ADMIN\", \"ROLE_CUSTOMER\"]")
        Set<ProfileEnum> profiles

) {}
