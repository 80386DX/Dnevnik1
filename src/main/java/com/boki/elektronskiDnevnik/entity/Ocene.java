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
@Table (name = "ocene")
public class Ocene {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idocene")
    private int id_ocene;
    
    @Column (name = "prvo-tromesecje")
    private int prvo_tromesecje;
    
    @Column (name = "drugo-tromesecje")
    private int drugo_tromesecje;
    
    @Column (name = "prvo-polugodiste")
    private int prvo_polugodiste;
    
    @Column (name = "trece-tromesecje")
    private int trece_tromesecje;
    
    @Column (name = "cetvrto-tromesecje")
    private int cetvrto_tromesecje;
    
    @Column (name = "zakljucna-ocena")
    private int zakljucna_ocena;
    
    @OneToOne (cascade = CascadeType.All)
    @JoinColumn(name = "predmeti_idpredmeti", referencedColumnName = "idpredmeti")
    private Predmeti ocene_predmeti;
}
