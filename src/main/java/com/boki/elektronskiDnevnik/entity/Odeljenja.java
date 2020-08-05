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
@Table (name = "odeljenja")
public class Odeljenja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idodeljenja")
    private int id_odeljenja;
    
    @Column (name = "ime-odeljenja")
    private String ime_odeljenja;
            
    @OneToOne (mappedBy = "odeljenja" )
    private Korisnici korisnici;
    
    @OneToOne (cascade = CascadeType.All)
    @JoinColumn(name = "rasporedi_idrasporedi", referencedColumnName = "idrasporedi")
    private Rasporedi rasporedi_odeljenja;
    
    
}
