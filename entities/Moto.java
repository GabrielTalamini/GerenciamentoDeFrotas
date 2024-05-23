package entities;

public class Moto extends Veiculo {
    private String marca;
    private boolean temCarenagem;

    public Moto(String placa, int ano, String modelo, String marca, boolean temCarenagem) {
        super(placa, ano, modelo);
        this.marca = marca;
        this.temCarenagem = temCarenagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }

    @Override
    public String toString() {
        return "Moto [placa=" + getPlaca() + ", ano=" + getAno() + ", modelo=" + getModelo() + ", marca=" + marca + ", temCarenagem=" + temCarenagem + "]";
    }
}
