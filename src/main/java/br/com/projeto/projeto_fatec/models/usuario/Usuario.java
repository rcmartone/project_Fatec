package br.com.projeto.projeto_fatec.models.usuario;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.projeto.projeto_fatec.models.cliente.Cliente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="USR")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @NotNull
    private Long id;
    @Column(name="email", length = 45)
    @NotBlank
    private String email;
    @Column(name="senha", length = 255)
    @NotBlank
    private String senha;
    @Column(name="papel", length = 7)
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private Papel papel;
    @NotNull
    private Timestamp dataInicio;
    private Timestamp dataFim;
    @NotNull
    private Boolean ativo;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataFim() {
        return dataFim;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    
}

