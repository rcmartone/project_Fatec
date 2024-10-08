package br.com.projeto.projeto_fatec.models.cliente;

import java.io.Serializable;
import java.util.List;

import br.com.projeto.projeto_fatec.models.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="CLT")
public class Cliente implements Serializable {

    @Id
    @Column(name="cpf", length=11)
    @NotBlank
    private String cpf;
    @Column(name="nome", length=45)
    @NotBlank
    private String nome;
    @Column(name="rg", length=12)
    @NotBlank
    private String rg;
    @Column(name="telefone", length=11)
    @NotBlank
    private String telefone;
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private Sexo sexo;

    @OneToOne(cascade=CascadeType.REMOVE)
    @JoinColumn(name = "USR_id",referencedColumnName="id")
    private Usuario usuario;

    @OneToMany( mappedBy="cliente", fetch=FetchType.LAZY)//Lazy busca apenas do objeto referenciado, caso não use, a busca nunca será realizada
    private List<ClientePrecedente> clientesPrecedente;

    @OneToMany( mappedBy="cliente", fetch=FetchType.LAZY)//Lazy busca apenas do objeto referenciado, caso não use, a busca nunca será realizada
    private List<ClienteContato> clientesContato;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<ClientePrecedente> getClientesPrecedente() {
        return clientesPrecedente;
    }

    public void setClientesPrecedente(List<ClientePrecedente> clientesPrecedente) {
        this.clientesPrecedente = clientesPrecedente;
    }

    public List<ClienteContato> getClientesContato() {
        return clientesContato;
    }

    public void setClientesContato(List<ClienteContato> clientesContato) {
        this.clientesContato = clientesContato;
    }

    
}

