package dev.wakandaacademy.produdoro.pomodoro.application.service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import org.springframework.stereotype.Service;

@Service
public class PomodoroService implements PomodoroApplicationService{
    @Override
    public ConfiguracaoPadrao getConfiguracaoPadrao() {
        //TODO implementar busca das configuracoes padroes no mongodb
        return ConfiguracaoPadrao.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repericoesParaPausaLonga(3)
                .build();

    }
}
