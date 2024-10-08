package br.com.projeto.projeto_fatec.models.usuario;

import java.io.Serializable;
import java.sql.Timestamp;

public class HistoricoUsuarioId implements Serializable {
    private Timestamp timestampAlt; // Campo da chave primária
    private int usuarioId; // Referente ao id da tabela USR

    // Construtores
    public HistoricoUsuarioId() {}

    public HistoricoUsuarioId(Timestamp timestampAlt, int usuarioId) {
        this.timestampAlt = timestampAlt;
        this.usuarioId = usuarioId;
    }

    // Getters e Setters
    public Timestamp getTimestampAlt() {
        return timestampAlt;
    }

    public void setTimestampAlt(Timestamp timestampAlt) {
        this.timestampAlt = timestampAlt;
    }

    public int getUsrId() {
        return usuarioId;
    }

    public void setUsrId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    // Implementar equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoricoUsuarioId)) return false;
        HistoricoUsuarioId that = (HistoricoUsuarioId) o;
        return usuarioId == that.usuarioId && timestampAlt.equals(that.timestampAlt);
    }

    @Override
    public int hashCode() {
        return 31 * timestampAlt.hashCode() + usuarioId;
    }
}