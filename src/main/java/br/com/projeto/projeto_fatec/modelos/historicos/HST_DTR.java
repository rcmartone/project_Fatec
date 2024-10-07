package br.com.projeto.projeto_fatec.modelos.historicos;

import java.sql.Timestamp;

import br.com.projeto.projeto_fatec.modelos.entidades.DTR;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@IdClass(HST_DTR_Id.class)
@Data
public class HST_DTR {
    @Id
    private Timestamp timestamp_Alt;

    @Id
    @ManyToOne
    @JoinColumn(name = "DTR_id", referencedColumnName = "id") // DTR_id refere-se ao id da tabela DTR
    private DTR dtr;

    private String operacao;
    private String camposAlt;

    public HST_DTR() {} //Construtor

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestamp_Alt;
    }

    public void setTimestampAlt(Timestamp timestamp_Alt) {
        this.timestamp_Alt = timestamp_Alt;
    }

    public DTR getDtr() {
        return dtr;
    }

    public void setDtr(DTR dtr) {
        this.dtr = dtr;
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

