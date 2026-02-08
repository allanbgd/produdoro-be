package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.Getter;

//próprio usuario pode criar um pacote pra ele
@Getter
//object de usuario
public class ConfiguracaoUsuario {

    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repericoesParaPausaLonga;

    public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao){
        this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
        this.tempoMinutosPausaCurta = configuracaoPadrao.getTempoMinutosPausaCurta();
        this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
        this.repericoesParaPausaLonga = configuracaoPadrao.getRepericoesParaPausaLonga();
    }
}
