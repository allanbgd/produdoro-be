package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CredencialService implements CredencialApplicationService{
    @Override
    public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
        //TODO Implementar metodo para criar nova credencial

    }
}
