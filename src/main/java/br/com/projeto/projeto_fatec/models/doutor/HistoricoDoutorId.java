package br.com.projeto.projeto_fatec.models.doutor;

import java.io.Serializable;
import java.sql.Timestamp;

public class HistoricoDoutorId implements Serializable {
    private Timestamp timestampAlt;
    private Long dtrId; 

    public HistoricoDoutorId() {}

    public HistoricoDoutorId(Timestamp timestampAlt, Long dtrId) {
        this.timestampAlt = timestampAlt;
        this.dtrId = dtrId;
    }

    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public Long getDtrId() {
        return dtrId;
    }

    public void setDtrId(Long dtrId) {
        this.dtrId = dtrId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((timestampAlt == null) ? 0 : timestampAlt.hashCode());
        result = prime * result + ((dtrId == null) ? 0 : dtrId.hashCode());
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
        if (dtrId == null) {
            if (other.dtrId != null)
                return false;
        } else if (!dtrId.equals(other.dtrId))
            return false;
        return true;
    }

     
}



