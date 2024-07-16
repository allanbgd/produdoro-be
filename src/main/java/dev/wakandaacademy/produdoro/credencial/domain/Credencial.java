package dev.wakandaacademy.produdoro.credencial.domain;
//Importações
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

//Anotações
@Document(collection = "Credencial")
@NoArgsConstructor(access= AccessLevel.PRIVATE)
@Builder//permite a criação 

// toda vez que o usuário for criado ele vem com a senha criptografada
public class Credencial {
	@MongoId(targetType = FieldType.STRING)
	@Getter
	private String usuario;
	private String senha;
	
	
	public Credencial(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = new BCryptPasswordEncoder().encode(senha);
	}
	
	//método chamado que permite o retorno da senha
	public String getPassword() {
		return senha;
				
	}
}
	