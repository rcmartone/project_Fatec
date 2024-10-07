package br.com.projeto.projeto_fatec.modelos.historicos;

import java.sql.Timestamp;

import br.com.projeto.projeto_fatec.modelos.entidades.CST;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@IdClass(HST_CST_Id.class)
@Data
public class HST_CST {
    @Id
    private Timestamp timestampAlt; // Campo da chave primária

    @Id
    @ManyToOne
    @JoinColumn(name = "CST_id", referencedColumnName = "id") // A coluna CST_id refere-se ao id da tabela CST
    private CST cst; // Relacionamento com a entidade CST

    private String tipo;
    private String status;
    private String observacao;
    private Timestamp dataInicio;
    private Timestamp dataFim;

    // Construtores, Getters e Setters
    public HST_CST() {}

    // Getters e Setters

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public CST getCst() {
        return cst;
    }

    public void setCst(CST cst) {
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

