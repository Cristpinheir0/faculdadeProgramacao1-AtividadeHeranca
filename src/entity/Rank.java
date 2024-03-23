package entity;

public enum Rank {
    PRIMERIO(1),
    SEGUNDO(2),
    TERCEIRO(3);

    public int getPosicao() {
        return posicao;
    }

    private int posicao;

    Rank(int posicao) {
        this.posicao = posicao;
    }


}
