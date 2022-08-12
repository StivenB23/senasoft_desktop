package sena.sena.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcuenta;

    @Column(name = "numerocuenta", unique = true)
    @NotEmpty(message = "El numero de cuenta no puede estar vacia")
    private String numerocuenta;

    @Column(name = "titular", length = 50, nullable = false)
    @NotEmpty
    private String titular;

    @Column(name = "saldo", length = 50, nullable = false)
    private double saldo;

    @Column(name = "fechaapertura", length = 50, nullable = false)
    @NotEmpty
    private String fechaapertura;

    @Column(name = "estado")
    private Boolean estado = true;


    public Cuenta() {
    }

    public Cuenta(String numerocuenta, String titular, double saldo, String fechaapertura) {
        this.numerocuenta = numerocuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaapertura = fechaapertura;
    }

    public Cuenta(Integer idcuenta, @NotEmpty(message = "El numero de cuenta no puede estar vacia") String numerocuenta,
        @NotEmpty String titular, double saldo, @NotEmpty String fechaapertura, Boolean estado) {
      this.idcuenta = idcuenta;
      this.numerocuenta = numerocuenta;
      this.titular = titular;
      this.saldo = saldo;
      this.fechaapertura = fechaapertura;
      this.estado = estado;
    }
    

    public Integer getIdcuenta() {
      return idcuenta;
    }

    public void setIdcuenta(Integer idcuenta) {
      this.idcuenta = idcuenta;
    }

    public String getNumerocuenta() {
      return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
      this.numerocuenta = numerocuenta;
    }

    public String getTitular() {
      return titular;
    }

    public void setTitular(String titular) {
      this.titular = titular;
    }

    public double getSaldo() {
      return saldo;
    }

    public void setSaldo(double saldo) {
      this.saldo = saldo;
    }

    public String getFechaapertura() {
      return fechaapertura;
    }

    public void setFechaapertura(String fechaapertura) {
      this.fechaapertura = fechaapertura;
    }

    public Boolean getEstado() {
      return estado;
    }

    public void setEstado(Boolean estado) {
      this.estado = estado;
    }
}