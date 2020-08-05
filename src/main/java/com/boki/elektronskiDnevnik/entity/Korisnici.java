package com.boki.elektronskiDnevnik.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.OneToOne;

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
    
    private String ime;
    private String prezime;
    private String sifra;
    
    @OneToOne (mappedBy = "korisnici")
    private Autorizacija autorizacija;
    
    @OneToOne (cascade = CascadeType.All)
    @JoinColumn(name = "odeljenja_idodeljenja", referencedColumnName = "idodeljenja")
    private Odeljenja odeljenja;
     
    
    
}
