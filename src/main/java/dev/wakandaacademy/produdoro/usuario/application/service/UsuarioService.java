package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.credencial.application.service.CredencialApplicationService;
import dev.wakandaacademy.produdoro.handler.APIException;
import dev.wakandaacademy.produdoro.pomodoro.application.service.PomodoroApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService{
    private final PomodoroApplicationService pomodoroService;
    private final CredencialApplicationService credencialService;
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioService - criaNovoUsuario");
        //usuario novo chega
        //configuracao padrao do pomodoro é aplicada
        if (usuarioRepository.existeEmail(usuarioNovo.getEmail())) {
            throw APIException.build(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Email já cadastrado"
            );
        }

        var configuracaoPadrao = pomodoroService.getConfiguracaoPadrao();
        //cria uma nova cridencial a partir do usuario
        credencialService.criaNovaCredencial(usuarioNovo);
        //criou um novo usuario baseado na configuracaopadrao
        var usuario = new Usuario(usuarioNovo, configuracaoPadrao );
        //salva usuario no banco de dados
        usuarioRepository.salva(usuario);
        log.info("[finish] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }
}
