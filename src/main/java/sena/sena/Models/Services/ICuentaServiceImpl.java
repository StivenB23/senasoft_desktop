package sena.sena.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.sena.Models.Cuenta;
import sena.sena.Models.ICuenta;


@Service
public class ICuentaServiceImpl implements ICuentaService{
    @Autowired ICuenta cuentad;

    @Override
    public List<Cuenta> findAll() {
        return (List<Cuenta>) cuentad.findAll();
    }

    @Override
    public void save(Cuenta cuenta) {
        cuentad.save(cuenta);
    }

    @Override
    public void delete(Integer idcuenta) {
        cuentad.deleteById(idcuenta);
    }

    @Override
    public Cuenta findOne(Integer idcuenta) {
        return cuentad.findById(idcuenta).orElse(null);
    }
}
