package hn.examen.segundo.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.examen.segundo.examen2.modelos.Clientes;
import hn.examen.segundo.examen2.servicios.clientesServicio;

@RestController
@RequestMapping("/api/clientes")
public class clienteController {

    @Autowired
    private clientesServicio clientesServicio;

    @PostMapping("/crear")
    public Clientes crearCliente(@RequestBody Clientes nvocliente) {
        if (!this.clientesServicio.validarExistenciaCliente(nvocliente.getDni())) {

            return this.clientesServicio.crearNuevoCliente(nvocliente);

        }

        return null;

    }

}
