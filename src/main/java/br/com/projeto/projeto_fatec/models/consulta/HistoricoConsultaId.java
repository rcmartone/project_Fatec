package br.com.projeto.projeto_fatec.models.consulta;

import java.io.Serializable;
import java.sql.Timestamp;


public class HistoricoConsultaId implements Serializable {
    private Timestamp timestampAlt; // Campo da chave primária
    private int cstId; // Referente ao id da tabela CST

    // Construtores
    public HistoricoConsultaId() {}

    public HistoricoConsultaId(Timestamp timestampAlt, int cstId) {
        this.timestampAlt = timestampAlt;
        this.cstId = cstId;
    }

    // Getters e Setters
    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public int getCstId() {
        return cstId;
    }

    public void setCstId(int cstId) {
        this.cstId = cstId;
    }

    // Implementar equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoricoConsultaId)) return false;
        HistoricoConsultaId that = (HistoricoConsultaId) o;
        return cstId == that.cstId && timestampAlt.equals(that.timestampAlt);
    }

    @Override
    public int hashCode() {
        return 31 * timestampAlt.hashCode() + cstId;
    }
}