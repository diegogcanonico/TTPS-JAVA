package modelo;

public class Emprendedor extends Usuario {

    private String identificadorEmprendedor;
    private Emprendimiento emprendimiento;

    public Emprendedor(String identificadorEmprendedor, Emprendimiento emprendimiento) {
        this.identificadorEmprendedor = identificadorEmprendedor;
        this.emprendimiento = emprendimiento;
    }

    public Emprendedor(String username, String password, String identificadorEmprendedor, Emprendimiento emprendimiento) {
        super(username, password);
        this.identificadorEmprendedor = identificadorEmprendedor;
        this.emprendimiento = emprendimiento;
    }

    public String getIdentificadorEmprendedor() {
        return identificadorEmprendedor;
    }

    public void setIdentificadorEmprendedor(String identificadorEmprendedor) {
        this.identificadorEmprendedor = identificadorEmprendedor;
    }

    public Emprendimiento getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(Emprendimiento emprendimiento) {
        this.emprendimiento = emprendimiento;
    }

    @Override
    public String toString() {
        return "Emprendedor{" +
                "identificadorEmprendedor='" + identificadorEmprendedor + '\'' +
                ", emprendimiento=" + emprendimiento +
                '}';
    }

}
