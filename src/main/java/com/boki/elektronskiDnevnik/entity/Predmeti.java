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
@Table (name = "predmeti")
public class Predmeti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpredmeti")
    private int id_predmeti;
    
    @Column(name = "ime-predmeta")
    private String ime_predmeta;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "rasporedi_idrasporedi", referencedColumnName = "idrasporedi")
    private Rasporedi rasporedi_predmeti;
    
    @OneToOne (mappedBy = "ocene_predmeti")
    private Ocene ocene;
    
}
