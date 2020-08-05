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
@Table (name = "rasporedi")
public class Rasporedi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrasporedi")
    private int id_rasporedi;
    
    @Column (name = "ime-rasporeda")
    private String ime_rasporeda;
    
    @OneToOne (mappedBy = "rasporedi_odeljenja")
    private Odeljenja odeljenja;
    
    @OnetToOne (mappedBy = "rasporedi_dani")
    private Dani dani;
    
    @OneToOne (mappedBy = "rasporedi_predmeti" )
    private Predmeti predmeti;
    
    
    
}
