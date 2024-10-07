package br.com.projeto.projeto_fatec.modelos.historicos;

import java.io.Serializable;
import java.sql.Timestamp;


public class HST_CST_Id implements Serializable {
    private Timestamp timestampAlt; // Campo da chave primária
    private int cstId; // Referente ao id da tabela CST

    // Construtores
    public HST_CST_Id() {}

    public HST_CST_Id(Timestamp timestampAlt, int cstId) {
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
        if (!(o instanceof HST_CST_Id)) return false;
        HST_CST_Id that = (HST_CST_Id) o;
        return cstId == that.cstId && timestampAlt.equals(that.timestampAlt);
    }

    @Override
    public int hashCode() {
        return 31 * timestampAlt.hashCode() + cstId;
    }
}