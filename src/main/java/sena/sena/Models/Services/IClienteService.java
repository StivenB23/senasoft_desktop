package sena.sena.Models.Services;
import sena.sena.Models.Cliente;
import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public void save (Cliente cliente);
    public Cliente findOne(Integer idcliente);
    public void delete(Integer idcliente);
}
