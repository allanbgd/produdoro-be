package dev.wakandaacademy.produdoro.usuario.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Usuario")
@Getter
public class Usuario {
    @Id
    private UUID idUsuario;
    @Email //validação
    @Indexed //achar campo com velocidade
    private String email;
    private ConfiguracaoUsuario configuracao;
    //usuario já começa com status em foco
    @Builder.Default
    private StatusUsuario status = StatusUsuario.FOCO;
    @Builder.Default
    private Integer quantidadePomodorosPausaCurta = 0;


}
