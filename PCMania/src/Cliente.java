public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[20];

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calcularTotalCompra(){

        float totalCompra = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null){
                totalCompra += computadores[i].getPreco();
            }
        }
        return ( System.out.println( nome + "O valor total da sua compra e de : " +  totalCompra);
    }


}
