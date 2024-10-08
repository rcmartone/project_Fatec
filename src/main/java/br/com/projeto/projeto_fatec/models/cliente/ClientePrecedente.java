package br.com.projeto.projeto_fatec.models.cliente;

import java.io.Serializable;

import br.com.projeto.projeto_fatec.models.precedente.Precedente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name ="CLT_PRC")
@IdClass(ClientePrecedenteId.class)
public class ClientePrecedente implements Serializable {

    @Id
    @Column(name="CLT_cpf", length= 11)
    @NotBlank
    private String cpf;
    @Id
    @Column(name="PRC_id")
    private Long prcId;
    @Column(name = "resposta_adicional", length=255)
    @NotBlank
    private String respostaAdicional;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "PRC_id", referencedColumnName="id")
    private Precedente precedente;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "CLT_cpf",  referencedColumnName="cpf")
    private Cliente cliente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getPrecedenteId() {
        return prcId;
    }

    public void setPrecedenteId(Long precedenteId) {
        this.prcId = precedenteId;
    }

    public String getRespostaAdicional() {
        return respostaAdicional;
    }

    public void setRespostaAdicional(String respostaAdicional) {
        this.respostaAdicional = respostaAdicional;
    }

    public Precedente getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Precedente precedente) {
        this.precedente = precedente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}

