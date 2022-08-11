package sena.sena.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    @Column(name = "cedulacliente", unique = true)
    @NotEmpty(message = "La cedula no puede estar vacia")
    @Size(min = 10, max = 10, message = "La cedula debe tener 10 digitos")

    private String cedulacliente;


    @Column(name = "nombre", length = 50, nullable = false)
    @NotEmpty
    private String nombre;

    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;

    @Column(name = "estado")
    private Boolean estado = true;





    public Cliente(Integer idcliente,
            @NotEmpty(message = "La cedula no puede estar vacia") @Size(min = 10, max = 10, message = "La cedula debe tener 10 digitos") String cedulacliente,
            @NotEmpty String nombre, String telefono, Boolean estado) {
        this.idcliente = idcliente;
        this.cedulacliente = cedulacliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Cliente(){}

    public Integer getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }


}
