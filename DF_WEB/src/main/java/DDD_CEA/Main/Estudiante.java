package DDD_CEA.Main;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int Nota;
    private String Email;

    public Estudiante(int id, String nombre, String apellido, int nota, String Email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        Nota = nota;
        this.Email = Email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {

    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {

    }
    public int getNota() {
        return Nota;
    }
    public void setNota(int nota) {

    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {

    }
}
