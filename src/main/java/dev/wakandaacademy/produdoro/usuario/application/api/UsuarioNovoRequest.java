package dev.wakandaacademy.produdoro.usuario.application.api;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

// parâmetros para um usuário novo
@Value
public class UsuarioNovoRequest {

    @Email(message = "Email inválido")
    private final String email;

    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private final String senha;
}
