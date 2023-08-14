package com.botas.musteriPortali.musteri.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gerceklesen_tmb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class GerceklesenTMB {
    @Id
    @SequenceGenerator(name = "seq_gerceklesen_tmb", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_gerceklesen_tmb", strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "miktar")
    private BigDecimal miktar;
    @Column(name = "tarih")
    private Date tarih;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bildirim_tip_id")
    private Bildirim bildirim;
}
