package br.com.projeto.projeto_fatec.modelos.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CLT_CTT {
    @Id //Define ID como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estrategia de geração de IDs
    private int id;
    private String tipo;
    private String contato;

    @ManyToOne //Cardinalidade Muitos para Um
    @JoinColumn(name = "CLIENTE_cpf") /*Aqui está especificando que a coluna CLIENTE_cpf na 
                                        tabela CLT_CTT será usada para armazenar a chave estrangeira
                                        que referencia a tabela CLT. O valor dessa coluna 
                                        corresponderá ao CPF do cliente na tabela CLT*/
    private CLT clt;//Este campo representa a associação entre a entidade CLT_CTT e a entidade CLT.//
}
