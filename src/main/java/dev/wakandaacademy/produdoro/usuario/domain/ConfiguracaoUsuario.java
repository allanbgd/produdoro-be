package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
//como está no mesmo pacote o próprio usuário pode criar uma configuração para ele
@Getter
public class ConfiguracaoUsuario {

	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
}
