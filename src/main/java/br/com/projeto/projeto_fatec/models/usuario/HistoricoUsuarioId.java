package br.com.projeto.projeto_fatec.models.usuario;

import java.io.Serializable;
import java.sql.Timestamp;

public class HistoricoUsuarioId implements Serializable {
    private Timestamp timestampAlt; // Campo da chave primária
    private int usrId; // Referente ao id da tabela USR

    // Construtores
    public HistoricoUsuarioId() {}

    public HistoricoUsuarioId(Timestamp timestampAlt, int usrId) {
        this.timestampAlt = timestampAlt;
        this.usrId = usrId;
    }

    // Getters e Setters
    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    // Implementar equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoricoUsuarioId)) return false;
        HistoricoUsuarioId that = (HistoricoUsuarioId) o;
        return usrId == that.usrId && timestampAlt.equals(that.timestampAlt);
    }

    @Override
    public int hashCode() {
        return 31 * timestampAlt.hashCode() + usrId;
    }
}