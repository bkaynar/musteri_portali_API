package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tmb_gerceklesen")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class TMBGerceklesen {
    @Id
    @SequenceGenerator(name = "seq_tmb_gerceklesen", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_tmb_gerceklesen", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "miktar")
    public BigDecimal  imza_tarihi;
    //Bildirim Tip ID Foreign Key Gelecek
    @ManyToOne
    @JoinColumn(name = "bildirim_tip_id")
    private Bildirim bildirim;//Burası Foreign Key Oluşturuyor
    @ManyToOne
    @JoinColumn(name = "istasyon_id")
    private Istasyon istasyon;//Burası Foreign Key Oluşturuyor
}


