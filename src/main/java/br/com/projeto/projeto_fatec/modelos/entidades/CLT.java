package br.com.projeto.projeto_fatec.modelos.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CLT {
    @Id
    private String cpf;
    private String nome;
    private String rg;
    private String telefone;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "USR_id")
    private USR usr;
}

