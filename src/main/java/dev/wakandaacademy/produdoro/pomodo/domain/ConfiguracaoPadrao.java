package dev.wakandaacademy.produdoro.pomodo.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Anotações
@Document(collection = "ConfiguracaoPadraoPomodoro")
@NoArgsConstructor(access= AccessLevel.PRIVATE)
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder//permite a criação 
@Getter

public class ConfiguracaoPadrao {
	@MongoId(targetType = FieldType.STRING)
	@Builder.Default
	private static final String CODIGO_DEFAULT = "Default";
	//sempre que codigo for chamado ele retornará default
	
	private String codigo = CODIGO_DEFAULT;
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
}
