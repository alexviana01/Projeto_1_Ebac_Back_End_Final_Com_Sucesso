/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexprojetofinal_1;

import java.util.Objects;

/**
 *
 * @author Alex
 */
class Cliente {
       
    private String nome;
    private Long cpf;
      public Cliente(String nome, String cpf){
      
       this.nome = nome;
        this.cpf = Long.valueOf(cpf);
      
      }
     
     public String getNome() {
        return nome;
    }
     
      public void setNome(String nome) {
        this.nome = nome;
    }
      
      public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    

     
}
