package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, String> {
    boolean existsByEmail(String email);
}
