package exemplos.patterns.strategy.acoes;

public enum TipoAcao {

    DIRIGIR(1L), PINTAR(2L);

    private final Long value;

    TipoAcao(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public static TipoAcao procurarAcao(Long value){
        for(TipoAcao tipo : values()){
            if( tipo.value == value){
                return tipo;
            }
        }

        return DIRIGIR;
    }

}
