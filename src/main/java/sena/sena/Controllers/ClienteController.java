// package sena.sena.Controllers;

// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.SessionAttributes;
// import org.springframework.web.bind.support.SessionStatus;

// import sena.sena.Models.Cliente;
// import sena.sena.Models.Services.IClienteService;

// @Controller
// @SessionAttributes("cliente")
// @RequestMapping("/clientes")
// public class ClienteController {

//     @Autowired IClienteService cliented;

//     @GetMapping(path={"/index"})
//     public String index(){
//         return "redirect:/index";
//     }

//     @GetMapping(path={"/","","listar"})
//     public String listar(Model m){
//         m.addAttribute("clientes", cliented.findAll());
//         return "views/clientes/listar";
//     }

//     @GetMapping(path= {"form","formulario"})
//     public String form(Model m){
//         Cliente cliente = new Cliente();
//         m.addAttribute("cliente", cliente);
//         m.addAttribute("accion", "crear");
//         return "views/clientes/form";
//     }

//     @GetMapping("/delete/{idcliente}")
//         public String delete(@PathVariable Integer idcliente) {
//         if(idcliente > 0) {
//         cliented.delete(idcliente);
//         }

//         return "redirect:/clientes";
//     }
//     @GetMapping("/edit/{idcliente}")
//     public String edit(@PathVariable Integer idcliente) {
//         Cliente cliente = null;
//         if (idcliente > 0) {
//             cliente = cliented.findOne(idcliente);
//             cliente.setEstado(!cliente.getEstado());
//             cliented.save(cliente);
//         }
//         return "redirect:/clientes";
//     }

//     @PostMapping("/add")
//         public String add(@Valid Cliente cliente,BindingResult response, Model m,SessionStatus status){
//             if(response.hasErrors()){
//                 return "views/clientes/form";
//             }
//             cliented.save(cliente);
//             status.setComplete();
//             return "redirect:/clientes/listar";
//     }
// }
