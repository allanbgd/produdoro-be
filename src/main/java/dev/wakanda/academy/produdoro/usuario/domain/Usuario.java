package dev.wakanda.academy.produdoro.usuario.domain;

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

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection="Usuario")
@Getter

public class Usuario {
@Id
private UUID idUsuario ;
@Email
@Indexed
private String email;
private ConfiguracaoUsuario configuracao;
@Builder.Default
private StatusUsuario status = StatusUsuario.FOCO;
@Builder.Default
private Integer quantidadePomodoroPausaCurta = 0;
}
