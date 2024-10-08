package br.com.projeto.projeto_fatec.models.doutor;

import java.io.Serializable;
import java.sql.Timestamp;

public class HistoricoDoutorId implements Serializable {
    private Timestamp timestampAlt;
    private Long doutorId; 

    public HistoricoDoutorId() {}

    public HistoricoDoutorId(Timestamp timestampAlt, Long doutorId) {
        this.timestampAlt = timestampAlt;
        this.doutorId = doutorId;
    }

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((timestampAlt == null) ? 0 : timestampAlt.hashCode());
        result = prime * result + ((doutorId == null) ? 0 : doutorId.hashCode());
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
        HistoricoDoutorId other = (HistoricoDoutorId) obj;
        if (timestampAlt == null) {
            if (other.timestampAlt != null)
                return false;
        } else if (!timestampAlt.equals(other.timestampAlt))
            return false;
        if (doutorId == null) {
            if (other.doutorId != null)
                return false;
        } else if (!doutorId.equals(other.doutorId))
            return false;
        return true;
    }

    public Long getDoutorId() {
        return doutorId;
    }

    public void setDoutorId(Long doutorId) {
        this.doutorId = doutorId;
    }

     
}



