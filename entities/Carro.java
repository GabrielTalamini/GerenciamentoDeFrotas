package entities;

public class Carro extends Veiculo {
    private int numeroDePortas;
    private String marca;

    public Carro(String placa, int ano, String modelo, String marca, int numeroDePortas) {
        super(placa, ano, modelo);
        this.marca = marca;
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro [placa=" + getPlaca() + ", ano=" + getAno() + ", modelo=" + getModelo() + ", marca=" + marca + ", portas=" + numeroDePortas + "]";
    }
}
