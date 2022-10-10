package modelo;

public class Administrador extends Usuario{

    private String identificadorAdministrador;

    public Administrador(String identificadorAdministrador) {
        this.identificadorAdministrador = identificadorAdministrador;
    }

    public Administrador(String username, String password, String identificadorAdministrador) {
        super(username, password);
        this.identificadorAdministrador = identificadorAdministrador;
    }

    public String getIdentificadorAdministrador() {
        return identificadorAdministrador;
    }

    public void setIdentificadorAdministrador(String identificadorAdministrador) {
        this.identificadorAdministrador = identificadorAdministrador;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "identificadorAdministrador='" + identificadorAdministrador + '\'' +
                '}';
    }

}
