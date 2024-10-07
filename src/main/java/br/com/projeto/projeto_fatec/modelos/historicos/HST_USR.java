package br.com.projeto.projeto_fatec.modelos.historicos;

import java.sql.Timestamp;

import br.com.projeto.projeto_fatec.modelos.entidades.USR;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@IdClass(HST_USR_Id.class)
@Data
public class HST_USR {
    @Id
    private Timestamp timestampAlt; // Campo da chave primária

    @Id
    @ManyToOne
    @JoinColumn(name = "USR_id", referencedColumnName = "id") // A coluna USR_id refere-se ao id da tabela USR
    private USR usr; // Relacionamento com a entidade USR

    private String operacao;
    private String camposAlt;

    // Construtores, Getters e Setters
    public HST_USR() {}

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public USR getUsr() {
        return usr;
    }

    public void setUsr(USR usr) {
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