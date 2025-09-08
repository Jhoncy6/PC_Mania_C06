public class Computador {
    private String marca;
    private float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;
    HardwareBasico hardwareBasico;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico hardwareBasico) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico;
    }

    public float getPreco() {
        return preco;
    }

    public void mostrarPcConfigs(){

    }


    public void addMemoriaUSB(HardwareBasico hardware) {

    }

}
