package sena.sena.Models.Services;
import sena.sena.Models.Cuenta;

import java.util.List;

public interface ICuentaService {
    public List<Cuenta> findAll();
    public void save (Cuenta cuenta);
    public Cuenta findOne(Integer idcuenta);
    public void delete(Integer idcuenta);
}