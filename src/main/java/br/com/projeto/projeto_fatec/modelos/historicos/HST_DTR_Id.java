package br.com.projeto.projeto_fatec.modelos.historicos;

import java.io.Serializable;
import java.sql.Timestamp;

public class HST_DTR_Id implements Serializable {
    private Timestamp timestampAlt;
    private int dtrId; // Supondo que DTR_id é do tipo int que refere-se ao id da tabela DTR

    // Construtores
    public HST_DTR_Id() {}

    public HST_DTR_Id(Timestamp timestampAlt, int dtrId) {
        this.timestampAlt = timestampAlt;
        this.dtrId = dtrId;
    }

    // Getters e Setters
    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public int getDtrId() {
        return dtrId;
    }

    public void setDtrId(int dtrId) {
        this.dtrId = dtrId;
    }

    // Implementar equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HST_DTR_Id)) return false;
        HST_DTR_Id that = (HST_DTR_Id) o;
        return dtrId == that.dtrId && timestampAlt.equals(that.timestampAlt);
    }

    @Override
    public int hashCode() {
        return 31 * timestampAlt.hashCode() + dtrId;
    }
}


