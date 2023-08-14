package com.botas.musteriPortali.musteri.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tahis")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Tahis implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_tahis", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_tahis", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "imza_tarihi")
    public Date imza_tarihi;
    @Column(name = "baslangic_tarihi")
    public Date baslangic_tarihi;
    @Column(name = "bitis_tarihi")
    public Date bitis_tarihi;
    @Column( name = "botas_odeyecegi",  length = 20, scale = 5)
    public BigDecimal botas_odeyecegi_tutar;
    @Column(name = "musteri_odeyecegi",length = 20, scale = 5)//Length, scaleden büyük olmak zorunda
    public BigDecimal musteri_odeyecegi_tutar;
    @Column(name = "damga_vergisi", length = 20, scale = 5)
    public BigDecimal damga_vergisi;
    //Musteri ID Foreign Key Gelecek
    @ManyToOne
    @JoinColumn(name = "musteri_tahis_id")
    private Musteri musteri;//Burası Foreign Key Oluşturuyor

}
