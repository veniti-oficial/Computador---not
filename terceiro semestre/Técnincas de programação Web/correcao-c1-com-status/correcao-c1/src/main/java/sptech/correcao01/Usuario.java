package sptech.correcao01;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Usuario {

    @NotBlank //Valida se não é nul, texto vazio ou só com espaços em branco
    @Size(min = 3)
    private String usuario;

    @NotBlank(message = "Mensagem editada") //Valida se não é nul, texto vazio ou só com espaços em branco
    @Size(min = 3, max = 16)
    private String senha;

    //@NotBlank NÃO PODE NOTBLANK, É SÓ PARA STRING
    @NotNull //pacote javax.validation, valida se o campo está presente ou nulo
    @Min(0) //valida se o valor e pelo menos 0 // @DecimalMin(0.1) para numero reais
    private Integer filhos;
    private String nome;

    //PasrOrPresent
    @Past
    private LocalDate dataNascimento; //format aaaa-mm-dd

    private boolean autenticado;

    public boolean autenticar(String usuario, String senha) {
        autenticado = usuario.equals(this.usuario) && senha.equals(this.senha);
        return autenticado;
    }

    public boolean isValido() {
        return usuario!=null && usuario.length() >= 3
                && senha!=null && senha.length() >= 3;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public Integer getFilhos() {
        return filhos;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
