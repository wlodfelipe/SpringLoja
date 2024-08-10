package com.lojaderoupa.lojaderoupa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "venda")
public class VendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ClienteEntity cliente;
    private FuncionarioEntity funcionario;
    private List<ProdutoEntity> produtos;
    private String observacao;
    private Double valorTotal;
}
