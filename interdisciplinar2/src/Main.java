public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
                new Carro( 213, 60),
                new Moto( 110, 70),
        };

        FluxoDeVeiculos fluxo = new FluxoDeVeiculos(veiculos);
        System.out.println("____________________");
        System.out.println("Pré Quicksort:");
        fluxo.exibirVeiculos();
        fluxo.quicksort(0, veiculos.length - 1);
        System.out.println("____________________");
        System.out.println("Pós Quicksort:");
        fluxo.exibirVeiculos();
        fluxo.fluxoDeObjetos(veiculos);
        int quantidadeDeVeiculos = fluxo.fluxoDeObjetos(veiculos);
        double mediaVelocidade = fluxo.calcularMediaVelocidade();
        System.out.println("____________________");
        System.out.println("Fluxo Total de Veículos: " + quantidadeDeVeiculos);
        System.out.println("Velocidade Média dos Veículos: " + mediaVelocidade + "Km/hora");
    }
}