package br.com.projeto.projeto_fatec.models.cliente;

import java.io.Serializable;

public class ClientePrecedenteId implements Serializable {

    private String cpf;
    private Long prcId;
    
    public ClientePrecedenteId(String cpf, Long prcId) {
        this.cpf = cpf;
        this.prcId = prcId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getPrcId() {
        return prcId;
    }

    public void setPrcId(Long prcId) {
        this.prcId = prcId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((prcId == null) ? 0 : prcId.hashCode());
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
        ClientePrecedenteId other = (ClientePrecedenteId) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (prcId == null) {
            if (other.prcId != null)
                return false;
        } else if (!prcId.equals(other.prcId))
            return false;
        return true;
    }
}
