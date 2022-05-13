/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udpsocket;

/**
 *
 * @author enric
 */
public class Utente {
    
    public String nome;
    public String email;
    
    public Utente(String nome, String email) {
        this.nome=nome;
        this.email=email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Nome Utente: " + nome + " Email: " + email;
    }
}
