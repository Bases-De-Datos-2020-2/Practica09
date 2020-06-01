package northwind.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Empleado {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String titulo;
    private String tituloDeCortesia;
    private String fechaNacimiento;
    private String fechaContratacion;
    private String telefonoCasa;
    private String extension;
    private String email;
    private String foto;
    private String notas;
    private Integer reportaEmpleado;
    private String phatFoto;
    private Region region;

    public Empleado(Integer idEmpleado, String nombre, String apellido, String titulo, String tituloDeCortesia, String fechaNacimiento, String fechaContratacion, String telefonoCasa, String extension, String email, String foto, String notas, Integer reportaEmpleado, String phatFoto, Region region) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.tituloDeCortesia = tituloDeCortesia;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.telefonoCasa = telefonoCasa;
        this.extension = extension;
        this.email = email;
        this.foto = foto;
        this.notas = notas;
        this.reportaEmpleado = reportaEmpleado;
        this.phatFoto = phatFoto;
        this.region = region;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloDeCortesia() {
        return tituloDeCortesia;
    }

    public void setTituloDeCortesia(String tituloDeCortesia) {
        this.tituloDeCortesia = tituloDeCortesia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getReportaEmpleado() {
        return reportaEmpleado;
    }

    public void setReportaEmpleado(Integer reportaEmpleado) {
        this.reportaEmpleado = reportaEmpleado;
    }

    public String getPhatFoto() {
        return phatFoto;
    }

    public void setPhatFoto(String phatFoto) {
        this.phatFoto = phatFoto;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
