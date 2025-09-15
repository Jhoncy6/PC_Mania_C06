package Computador;

public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional = new SistemaOperacional();
    private HardwareBasico[] hardwares = new HardwareBasico[3];

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        for (int i = 0; i < hardwares.length; i++) {
            hardwares[i] = new HardwareBasico();
        }
    }

    public float getPreco() {
        return preco;
    }

    public HardwareBasico[] getHardwares() {
        return hardwares;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void addMemoriaUsb (MemoriaUSB musb){
        this.memoriaUSB = musb;
    }

    public void mostrarPcConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        for ( int i = 0;  i < hardwares.length; i++){
            if (hardwares[i] != null){
            System.out.println("Processador: " + hardwares[i].getNome() + "(" + hardwares[i].getCapacidade() + ")" );
            }
        }
        System.out.println("Sistema operacional : " + sistemaOperacional.getNome() + "(" + sistemaOperacional.getTipo() + " bits)" );
        System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
    }



}
