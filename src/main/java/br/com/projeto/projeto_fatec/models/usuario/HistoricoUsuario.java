package br.com.projeto.projeto_fatec.models.usuario;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@IdClass(HistoricoUsuarioId.class)
public class HistoricoUsuario {
    @Id
    private Timestamp timestampAlt; // Campo da chave primária

    @Id
    @ManyToOne
    @JoinColumn(name = "USR_id", referencedColumnName = "id") // A coluna USR_id refere-se ao id da tabela Usuario
    private Usuario usr; // Relacionamento com a entidade Usuario

    private String operacao;
    private String camposAlt;

    // Construtores, Getters e Setters
    public HistoricoUsuario() {}

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getCamposAlt() {
        return camposAlt;
    }

    public void setCamposAlt(String camposAlt) {
        this.camposAlt = camposAlt;
    }
}