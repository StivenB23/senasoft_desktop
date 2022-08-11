package sena.sena.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pruebaCuenta")
public class PruebaCuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="idCuentafk")
    private Cuenta cuentas;

    @ManyToOne
    @JoinColumn(name="idClientefk")
    private Cliente clientes;
    public PruebaCuenta(){}
    public PruebaCuenta(Integer id, Cuenta cuentas, Cliente clientes) {
        this.id = id;
        this.cuentas = cuentas;
        this.clientes = clientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cuenta getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta cuentas) {
        this.cuentas = cuentas;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }



}
