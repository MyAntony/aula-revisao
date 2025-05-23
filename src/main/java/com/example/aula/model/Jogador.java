package com.example.aula.model;

// import com.example.aula.model.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.Size;

@Entity
public class Jogador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    // @NotBlank(message = "E-mail é obrigatório.")
    // @Email(message = "Deve ser um e-mail válido.")
    // private String email;

    // @NotBlank(message = "Senha é obrigatória.")
    // @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.")
    // private String senha;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotBlank(message = "Idade é obrigatória.")
    private String idade;

    @NotBlank(message = "Altura é obrigatória.")
    private String altura;

    @NotBlank(message = "Peso é obrigatório.")
    private String peso;

    // @NotBlank(message = "Posição é obrigatória.")
    @Enumerated(EnumType.STRING)
    private Posicao posicao;

    @NotBlank(message = "Número da camisa é obrigatório.")
    private String numeroCamisa;

    public Jogador()
    {

    }

    // public Jogador(Long id, String nome, String email, String senha)
    // {
    //     this.id = id;
    //     this.nome = nome;
    //     this.email = email;
    //     this.senha = senha;
    // }

    public Jogador(Long id, String nome, Sexo sexo, String idade, String altura, String peso, Posicao posicao, String numeroCamisa)
    {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Sexo getSexo()
    {
        return sexo;
    }

    public void setSexo(Sexo sexo)
    {
        this.sexo = sexo;
    }
    
    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }

    public String getAltura()
    {
        return altura;
    }

    public void setAltura(String altura)
    {
        this.altura = altura;
    }

    public String getPeso()
    {
        return peso;
    }

    public void setPeso(String peso)
    {
        this.peso = peso;
    }

    public Posicao getPosicao()
    {
        return posicao;
    }

    public void setPosicao(Posicao posicao)
    {
        this.posicao = posicao;
    }

    public String getNumeroCamisa()
    {
        return numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa)
    {
        this.numeroCamisa = numeroCamisa;
    }
}
