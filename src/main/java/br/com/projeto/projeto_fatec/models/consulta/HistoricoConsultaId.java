package br.com.projeto.projeto_fatec.models.consulta;

import java.io.Serializable;
import java.sql.Timestamp;


public class HistoricoConsultaId implements Serializable {
    private Timestamp timestampAlt; // Campo da chave primária
    private Long cstId; // Referente ao id da tabela CST

    // Construtores
    public HistoricoConsultaId() {}

    public HistoricoConsultaId(Timestamp timestampAlt, Long cstId) {
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

    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((timestampAlt == null) ? 0 : timestampAlt.hashCode());
        result = prime * result + ((cstId == null) ? 0 : cstId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HistoricoConsultaId other = (HistoricoConsultaId) obj;
        if (timestampAlt == null) {
            if (other.timestampAlt != null)
                return false;
        } else if (!timestampAlt.equals(other.timestampAlt))
            return false;
        if (cstId == null) {
            if (other.cstId != null)
                return false;
        } else if (!cstId.equals(other.cstId))
            return false;
        return true;
    }

    
}