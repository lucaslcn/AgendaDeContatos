/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author lucas.lucian
 */
public class Contato {

    private static int numeroSequencial;
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private Tipo tipo;
    private int numeroMensagens;
    
    public Contato()
    {
        setNumeroSequencial(numeroSequencial + 1);
    }

    public static int getNumeroSequencial() {
        return numeroSequencial;
    }

    public static void setNumeroSequencial(int numeroSequencial) {
        Contato.numeroSequencial = numeroSequencial;
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMensagens() {
        return numeroMensagens;
    }

    public void setNumeroMensagens(int numeroMensagens) {
        this.numeroMensagens = numeroMensagens;
    }
    
    
    
}
