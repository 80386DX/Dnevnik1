package com.boki.elektronskiDnevnik.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "dani")
public class Dani {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddani")
    private int id_dan;
    
    @Column (name = "ime", nullable = false)
    private String ime;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "rasporedi_idrasporedi", referencedColumnName = "idrasporedi")
    private Rasporedi rasporedi_dani;
}
