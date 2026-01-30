package dev.wakandaacademy.produdoro.usuario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value= "/v1/usuario")
public interface UsuarioAPI {
    // POST para criar um novo usuário
    // Recebe os dados no body e valida via UsuarioNovoRequest
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse postNovoUsuario(@RequestBody @Valid UsuarioNovoRequest usuarioNovo);

}
