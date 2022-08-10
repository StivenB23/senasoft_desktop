package sena.sena.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sena.sena.Models.Cuenta;
import sena.sena.Models.Services.ICuentaService;

@Controller
@SessionAttributes("cuenta")
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired ICuentaService cuentad;

  @GetMapping(path = {"/listar","","/"})
  public String listar(Model m){
    m.addAttribute("cuentas", cuentad.findAll());
    return "views/cuenta/listar";
  }

  @GetMapping("/edit/{idcuenta}")
    public String ver(@PathVariable Integer idcuenta,Model m){
      Cuenta cuenta = null;

    if ( idcuenta > 0 ){
      cuenta = cuentad.findOne(idcuenta);
    }
    else{
      return "redirect:cuentas/listar";
    }
    m.addAttribute("cuenta", cuenta);
    m.addAttribute("accion","Actualizar Cuenta");
    return "views/cuenta/add";
  }

  @GetMapping("/edite/{idcuenta}")
  public String edit(@PathVariable Integer idcuenta) {
      Cuenta cuenta = null;
      if (idcuenta > 0) {
          cuenta = cuentad.findOne(idcuenta);
          cuenta.setEstado(!cuenta.getEstado());
          cuentad.save(cuenta);
      }
      return "redirect:/cuentas/listar";
  }

  @GetMapping("/form")
  public String form(Model m){
    Cuenta cuenta = new Cuenta();
    m.addAttribute("cuenta", cuenta);
    m.addAttribute("accion","Crear Cuenta");
    return "views/cuenta/add";
  }

  @PostMapping("/add")
  public String add(@Valid Cuenta cuenta, BindingResult res, Model m, SessionStatus status){
    if(res.hasErrors()){
      return "views/cuenta/add";
    }
    cuentad.save(cuenta);
    status.setComplete();
    return "redirect:/cuentas/listar";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable Integer id) {
    if( id > 0) {
      cuentad.delete(id);
    }
    return "redirect:/cuentas/listar";
  }
}
