package br.com.projeto.projeto_fatec.modelos.entidades;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class CST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;
    private String status;
    private String observacao;
    private Timestamp dataInicio;
    private Timestamp dataFim;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "CLT_cpf")
    private CLT clt;

    @ManyToOne
    @JoinColumn(name = "DTR_id")
    private DTR dtr;
}

