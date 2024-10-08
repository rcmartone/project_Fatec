package br.com.projeto.projeto_fatec.models.precedente;

import java.io.Serializable;
import java.util.List;

import br.com.projeto.projeto_fatec.models.cliente.ClientePrecedente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="PRC")
public class Precedente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nome", length=45)
    @NotBlank
    private String nome;
    @Column(name="adicional", length=45)
    private String adicional;
    @OneToMany(mappedBy="precedente", fetch=FetchType.LAZY)
    private List<ClientePrecedente> clientesPrecedente;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public List<ClientePrecedente> getClientesPrecedente() {
        return clientesPrecedente;
    }

    public void setClientesPrecedente(List<ClientePrecedente> clientesPrecedente) {
        this.clientesPrecedente = clientesPrecedente;
    }
}


