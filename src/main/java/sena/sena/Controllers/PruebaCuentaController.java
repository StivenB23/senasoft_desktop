package sena.sena.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sena.sena.Models.IPruebaCuenta;
import sena.sena.Models.PruebaCuenta;
import sena.sena.Models.Services.IClienteService;
import sena.sena.Models.Services.ICuentaService;

@Controller
@SessionAttributes("pruebaCuenta")
@RequestMapping("/pruebacuenta")
public class PruebaCuentaController {
    @Autowired IClienteService cliented;
    @Autowired ICuentaService cuentad;
    @Autowired IPruebaCuenta pruebac;

    @GetMapping(path={"/","/form"})
    public String listar(Model m){
        PruebaCuenta prueba = new PruebaCuenta();
        m.addAttribute("prueba", prueba);
        m.addAttribute("clientes", cliented.findAll());
        m.addAttribute("cuentas", cuentad.findAll());
        return "views/relation";
    }

    @PostMapping("/add")
    public String add(@Valid PruebaCuenta prueba, BindingResult res, Model m, SessionStatus status){
    if(res.hasErrors()){
      return "views/cuenta/add";
    }
    pruebac.save(prueba);
    status.setComplete();
    return "redirect:/cuentas/listar";
  }
}
