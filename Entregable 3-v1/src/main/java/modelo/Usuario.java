package modelo;

public class Usuario {

    private String username;
    private String apellido;
    private String nombre;
    private String password;
    private Emprendimiento emprendimiento;
    private Rol rol;

    public Usuario(String username, String apellido, String nombre, String password, Emprendimiento emprendimiento, Rol rol) {
        this.username = username;
        this.apellido = apellido;
        this.nombre = nombre;
        this.password = password;
        this.emprendimiento = emprendimiento;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Emprendimiento getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(Emprendimiento emprendimiento) {
        this.emprendimiento = emprendimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", emprendimiento=" + emprendimiento +
                ", rol=" + rol +
                '}';
    }

}
