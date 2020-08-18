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
import javax.persistence.CascadeType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "korisnici")
public class Korisnici {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkorisnici")
    private int id_korisnici;
  
    @Column(nullable = false)
    private String ime;
    
    @Column(nullable = false)
    private String prezime;
    
    @Column(nullable = false)
    private String sifra;
    
    @OneToOne (mappedBy = "korisnici")
    private Autorizacija autorizacija;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "odeljenja_idodeljenja", referencedColumnName = "idodeljenja")
    private Odeljenja odeljenja;
     
    
    
}
