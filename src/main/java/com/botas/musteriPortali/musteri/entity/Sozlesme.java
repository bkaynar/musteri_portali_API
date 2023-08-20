package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="sozlesme")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Sozlesme {

    @Id
    @SequenceGenerator(name = "seq_musteri", initialValue = 1,allocationSize = 50 )
    @GeneratedValue(generator = "seq_musteri", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_Sozlesme_id")
    private Musteri musteri;//Burası Foreign Key Oluşturuyor

    @Column(name = "yil", length = 4)
    private int yil;

    @Column(name = "ysm_miktar", precision = 20, scale = 2)
    private BigDecimal ysmMiktar;

    @Column(name = "azami yillik miktar", precision = 20, scale = 2)
    private BigDecimal azamiYillikMiktar;

    @Column(name = "aat_orani", precision = 20, scale = 2)
    private BigDecimal aatOrani;

}
