package br.com.projeto.projeto_fatec.models.cliente;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="CLT_CTT")
public class ClienteContato implements Serializable {
    @Id 
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estrategia de geração de IDs
    private Long id;
    @Column(name="tipo", length=45)
    @NotBlank
    private String tipo;
    @Column(name="contato", length=45)
    @NotBlank
    private String contato;

    @ManyToOne(fetch=FetchType.LAZY) //Cardinalidade Muitos para Um
    @JoinColumn(name = "CLIENTE_cpf", referencedColumnName="cpf") /*Aqui está especificando que a coluna CLIENTE_cpf na 
                                        tabela ClienteContato será usada para armazenar a chave estrangeira
                                        que referencia a tabela Cliente. O valor dessa coluna 
                                        corresponderá ao CPF do cliente na tabela Cliente*/
    private Cliente cliente;//Este campo representa a associação entre a entidade ClienteContato e a entidade Cliente.//

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}

