package com.livraria.treina.livrariatreina.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "autores")
public class Autor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idAutor;

  @Column(nullable = false)
  private String nome;

  @Column(unique = true)
  private String email;

  @Column(unique = true)
  private String cpf;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  private Boolean temPremio;
}
