package br.com.projeto.projeto_fatec.modelos.entidades;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class USR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String senha;
    private String papel;
    private Timestamp dataInicio;
    private Timestamp dataFim;
    private boolean ativo;

    @OneToMany(mappedBy = "usr")
    private List<CLT> clientes;
}

