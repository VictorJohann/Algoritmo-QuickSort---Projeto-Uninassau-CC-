public abstract class Veiculo {
    protected int fluxo;
    protected int velocidade;

    public Veiculo(int fluxo, int velocidade) {
        this.fluxo = fluxo;
        this.velocidade = velocidade;
    }

    public abstract void exibirInformacoes();


    public int getFluxo() {
        return fluxo;
    }

    public int getVelocidade() {
        return velocidade;
    }
}

    class Carro extends Veiculo {

    public Carro (int fluxo, int velocidade){
            super(fluxo, velocidade);
        }

        @Override
        public void exibirInformacoes(){
            System.out.println("Fluxo de Carros: " +fluxo);
            System.out.println("Velocidade Média: " + velocidade + "Km/hora");
            System.out.println("");
        }
    }

class Moto extends Veiculo {
    public Moto (int fluxo, int velocidade){
        super(fluxo, velocidade);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Fluxo de Motos: " + fluxo);
        System.out.println("Velocidade Média: " + velocidade + " Km/hora");
        System.out.println("");
    }
}


