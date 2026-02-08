package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;

public interface CredencialApplicationService {

    void criaNovaCredencial(UsuarioNovoRequest usuarioNovo);
}
