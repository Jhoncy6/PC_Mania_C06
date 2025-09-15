package Computador;

public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwares;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new  SistemaOperacional("", 0);
        this.hardwares = new HardwareBasico[3];
        for (int i = 0; i < this.hardwares.length; i++) {
            this.hardwares[i] = new HardwareBasico("", 0);
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
