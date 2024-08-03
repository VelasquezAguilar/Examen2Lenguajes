package hn.examen.segundo.examen2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen.segundo.examen2.modelos.Clientes;
import hn.examen.segundo.examen2.modelos.Prestamos;
import hn.examen.segundo.examen2.repositorios.clientesRepositorio;
import hn.examen.segundo.examen2.repositorios.prestamosRepositorio;

@Service
public class clientesServicio {

    @Autowired
    private clientesRepositorio clientesRepositorio;

    @Autowired
    private prestamosRepositorio prestamosRepositorio;

    public Clientes crearNuevoCliente(Clientes nvoCliente) {

        List<Prestamos> nvoPrestamo = nvoCliente.getPrestamos();
        if (nvoPrestamo != null) {

            for (Prestamos producto : nvoPrestamo) {
                producto.setCliente(nvoCliente);
            }

        }

        return this.clientesRepositorio.save(nvoCliente);

    }

    /*
     * public Clientes crearCliente(Clientes nvCliente) {
     * 
     * tipoCliente tipocliente = nvCliente.getTipocliente();
     * if (tipocliente != null) {
     * 
     * tipocliente.setDescripcion(nvCliente.getTipocliente().getDescripcion());
     * this.tipoClienteRepositorio.save(tipocliente);
     * }
     * 
     * return this.clienteRepositorio.save(nvCliente);
     * }
     */

    public boolean validarExistenciaCliente(String dni) {
        return this.clientesRepositorio.existsById(dni);
    }

}
