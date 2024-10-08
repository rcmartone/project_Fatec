package br.com.projeto.projeto_fatec.models.consulta;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.projeto.projeto_fatec.models.cliente.Cliente;
import br.com.projeto.projeto_fatec.models.doutor.Doutor;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="CST")
public class Consulta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="tipo", length=30)
    @NotBlank
    private String tipo;
    @Column(name="status", length=10)
    @NotBlank
    private String status;
    @Column(name="observacao", length=255)
    private String observacao;
    @Column(name="dataInicio")
    @NotNull
    private Timestamp dataInicio;
    @Column(name="dataFim")
    @NotNull
    private Timestamp dataFim;
    @Column(name="valor")
    @NotNull
    private double valor;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "CLT_cpf", referencedColumnName="cpf")
    private Cliente cliente;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "DTR_id", referencedColumnName="id")
    private Doutor doutor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Doutor getDoutor() {
        return doutor;
    }

    public void setDoutor(Doutor doutor) {
        this.doutor = doutor;
    }
}

