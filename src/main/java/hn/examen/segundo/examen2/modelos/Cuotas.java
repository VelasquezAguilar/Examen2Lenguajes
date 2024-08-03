package hn.examen.segundo.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocuota")
    private long codigoCuota;

    private Integer mes;

    private double intereses;

    private double capital;

    private double saldo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoprestamo", referencedColumnName = "codigoprestamo")
    
}
