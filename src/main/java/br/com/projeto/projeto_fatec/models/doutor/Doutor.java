package br.com.projeto.projeto_fatec.models.doutor;

import java.io.Serializable;

import br.com.projeto.projeto_fatec.models.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "DTR")
public class Doutor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="id", length=45)
    @NotBlank
    private String nome;
    @Column(name="cro", length=6)
    @NotBlank
    private String cro;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "USR_id", referencedColumnName="id")
    private Usuario usuario;

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

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

