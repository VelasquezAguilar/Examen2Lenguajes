package hn.examen.segundo.examen2.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoprestamo")
    private long codigoPrestamo;

    @Column(name = "fechaApertura")
    private Data fechaApertura;

    private double monto;

    private Integer plazo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Clientes cliente;

    @OneToMany(mappedBy = "codigoprestamo", cascade = CascadeType.ALL)
    private List<Cuotas> cuotas;

}
