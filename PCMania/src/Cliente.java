public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
    }


    public Computador[] getComputadores() {
        return computadores;
    }

    public void carinhoComputadores(Computador computador) {
        for (int i = 0; i < this.computadores.length; i++) {
            if (this.computadores[i] == null){
                this.computadores[i] = computador;
                break;
            }
        }
    }


    public float calcularTotalCompra(){
        float totalCompra = 0;
        for (int i = 0; i < this.computadores.length; i++) {
            if (this.computadores[i] != null){
                totalCompra += this.computadores[i].getPreco();
            }
        }
        return  totalCompra;
    }


}
