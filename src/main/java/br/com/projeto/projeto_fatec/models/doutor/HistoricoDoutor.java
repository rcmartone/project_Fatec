package br.com.projeto.projeto_fatec.models.doutor;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@IdClass(HistoricoDoutorId.class)
public class HistoricoDoutor implements Serializable {
    @Id
    private Timestamp timestamp_Alt;

    @Id
    @ManyToOne
    @JoinColumn(name = "DTR_id", referencedColumnName = "id") // DTR_id refere-se ao id da tabela DTR
    private Doutor doutor;

    private String operacao;
    private String camposAlt;

    public HistoricoDoutor() {} //Construtor

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestamp_Alt;
    }

    public void setTimestampAlt(Timestamp timestamp_Alt) {
        this.timestamp_Alt = timestamp_Alt;
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

    public Doutor getDoutor() {
        return doutor;
    }

    public void setDoutor(Doutor doutor) {
        this.doutor = doutor;
    }
}

