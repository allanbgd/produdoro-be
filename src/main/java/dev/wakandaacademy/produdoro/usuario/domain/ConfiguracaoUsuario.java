package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

//próprio usuario pode criar um pacote pra ele
@Builder(access = AccessLevel.PACKAGE)
@Getter
//object de usuario
public class ConfiguracaoUsuario {

    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repericoesParaPausaLonga;
}
