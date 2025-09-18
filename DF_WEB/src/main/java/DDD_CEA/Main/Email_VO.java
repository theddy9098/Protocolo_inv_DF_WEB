package DDD_CEA.Main;

public final class Email_VO {
    private final String direccion;

    public Email_VO(String direccion) {
        if (direccion == null || !direccion.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Email_VO)) return false;
        Email_VO other = (Email_VO) obj;
        return direccion.equals(other.direccion);
    }
    @Override
    public int hashCode() {
        return direccion.hashCode();
    }


}
