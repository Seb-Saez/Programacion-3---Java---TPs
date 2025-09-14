package U3_act_3_lombok_dto;

public class Producto {
    private String codigo;
    private String nombre;
    private float precio;
    private String autor;

    public Producto(String codigo, String nombre, float precio, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.autor = autor;
    }

    // geteers
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getAutor() {
        return autor;
    }

    // setters


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // toString


    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                '}';
    }
}
