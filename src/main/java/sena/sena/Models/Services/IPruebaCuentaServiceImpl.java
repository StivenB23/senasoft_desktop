package sena.sena.Models.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.sena.Models.IPruebaCuenta;
import sena.sena.Models.PruebaCuenta;

@Service
public class IPruebaCuentaServiceImpl implements IPruebaCuentaService{
    @Autowired IPruebaCuenta pruebacuentaed;

     @Override
    public void save(PruebaCuenta pruebacuenta) {
        pruebacuentaed.save(pruebacuenta); 
    }
}