package one.digitalinnovaton.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pokemon {

    @Id
    private Long id;
    private String nome;
    private String tipo;
    @ManyToOne
    private Ataques ataques;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Ataques getAtaques() {
        return ataques;
    }
    public void setAtaques(Ataques ataques) {
        this.ataques = ataques;
    }

    
    
}
