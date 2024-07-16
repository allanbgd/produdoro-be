package dev.wakandaacademy.produdoro.usuario.domain;

import java.util.UUID;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Anotações
@Document(collection = "Usuario")
@NoArgsConstructor(access= AccessLevel.PRIVATE)
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder//permite a criação, quando for criado vai pegar o defaul como exemplo
@Getter
public class Usuario {
	@Id
	private UUID idUsuario;
	@Email
	@Indexed //indexa esse campo e faz o mongo verificar com mais velocidade
	private String email;
	private ConfiguracaoUsuario configuracao;
	@Builder.Default
	private StatusUsuario status = StatusUsuario.FOCO;
	@Builder.Default
	private Integer quantidadePomodorosPausasCurtas = 0;
}
