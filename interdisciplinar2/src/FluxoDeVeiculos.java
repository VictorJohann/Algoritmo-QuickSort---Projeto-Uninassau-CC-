class FluxoDeVeiculos {
    private Veiculo[] veiculos;

    public FluxoDeVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public void quicksort(int start, int end) {
        if (start < end) {
            int pivotIndex = particao(start, end);
            quicksort(start, pivotIndex - 1);
            quicksort(pivotIndex + 1, end);
        }
    }

    private int particao(int start, int end) {
        Veiculo pivot = veiculos[start];
        int i = start + 1;
        for (int j = start + 1; j <= end; j++) {
            if (veiculos[j].getFluxo() < pivot.getFluxo()) {
                Veiculo temp = veiculos[i];
                veiculos[i] = veiculos[j];
                veiculos[j] = temp;
                i++;
            }
        }
        Veiculo temp = veiculos[start];
        veiculos[start] = veiculos[i - 1];
        veiculos[i - 1] = temp;
        return i - 1;
    }

    public void exibirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
        }
    }
    public int fluxoDeObjetos(Object[] array) {
        int fluxoTotal = 0;
        for (Veiculo veiculo : veiculos) {
            fluxoTotal += veiculo.getFluxo();
        }
        return fluxoTotal;
    }

    public double calcularMediaVelocidade() {
        double somaVelocidades = 0;
        for (Veiculo veiculo : veiculos) {
            somaVelocidades += veiculo.getVelocidade();
        }
        return somaVelocidades / veiculos.length;
    }
}

