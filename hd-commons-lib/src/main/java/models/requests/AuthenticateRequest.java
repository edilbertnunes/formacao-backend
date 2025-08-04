package models.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;

public record AuthenticateRequest(

        @Schema(description = "User email", example = "edilbert@example.com")
        @Email(message = "Invalid email")
        @NotBlank(message = "email cannot be empty")
        @Size(min = 6, max = 50, message = "email must be between 6 and 50 characters")
        String email,

        @Schema(description = "User password", example = "123456")
        @Size(min = 6, max = 50, message = "password must be between 6 and 50 characters")
        @NotBlank(message = "password cannot be empty")
        String password

) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
