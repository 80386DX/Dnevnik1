package com.boki.elektronskiDnevnik.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "autorizacija")
public class Autorizacija {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idautorizacija")
    private int id_autorizacija;
    
    @Column (name = "rang", nullable = false, unique = true)
    private String rang;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "korisnici_idkorisnici", referencedColumnName = "idkorisnici")
    private Korisnici korisnici;
    
   
}
