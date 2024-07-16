package dev.wakandaacademy.produdoro.tarefa.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "Tarefa")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder // permite a criação, quando for criado vai pegar o defaul como exemplo
@Getter
public class Tarefa {
	@Id
	private UUID idTarefa;
	private String nome;
	private String descricao;
	@Indexed
	private UUID idArea;
	@Indexed
	private UUID idUsuario;
	@Indexed
	private UUID idProjeto;
	@Builder.Default // deixa o status A_FAZER como o principal ao executar a aplicação
	private StatusTarefa status = StatusTarefa.A_FAZER;

}
