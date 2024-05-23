package entities;

public abstract class Veiculo {
    private String placa;
    private int ano;
    private String modelo;

    public Veiculo(String placa, int ano, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
