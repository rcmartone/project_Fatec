package br.com.projeto.projeto_fatec.modelos.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CLT_PRC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String adicional;

    @ManyToOne
    @JoinColumn(name = "PRC_SD_id")
    private PRC_SD prcSd;

    @ManyToOne
    @JoinColumn(name = "CLT_cpf")
    private CLT clt;
}

