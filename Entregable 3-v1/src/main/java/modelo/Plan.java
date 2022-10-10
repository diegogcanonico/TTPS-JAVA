package modelo;

public class Plan {

    private Double valor;
    private Integer cuotas;
    private String beneficio;

    public Plan(Double valor, Integer cuotas, String beneficio) {
        this.valor = valor;
        this.cuotas = cuotas;
        this.beneficio = beneficio;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "valor=" + valor +
                ", cuotas=" + cuotas +
                ", beneficio='" + beneficio + '\'' +
                '}';
    }

}
