package br.com.projeto.projeto_fatec.models.consulta;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@IdClass(HistoricoConsultaId.class)
public class HistoricoConsulta implements Serializable {
    @Id
    private Timestamp timestampAlt; // Campo da chave primária

    @Id
    @ManyToOne
    @JoinColumn(name = "CST_id", referencedColumnName = "id") // A coluna CST_id refere-se ao id da tabela Consulta
    private Consulta cst; // Relacionamento com a entidade Consulta

    private String tipo;
    private String status;
    private String observacao;
    private Timestamp dataInicio;
    private Timestamp dataFim;

    // Construtores, Getters e Setters
    public HistoricoConsulta() {}

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public Consulta getCst() {
        return cst;
    }

    public void setCst(Consulta cst) {
        this.cst = cst;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataFim() {
        return dataFim;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }
}

