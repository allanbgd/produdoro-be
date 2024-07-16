package dev.wakandaacademy.produdoro.projeto.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class projeto {
	@Id
	private UUID idProjeto;
	private UUID idUsuario;
}
