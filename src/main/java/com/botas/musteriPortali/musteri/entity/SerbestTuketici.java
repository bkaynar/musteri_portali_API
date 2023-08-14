package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "serbest_Tuketici")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class SerbestTuketici {
    @Id
    @SequenceGenerator(name = "seq_serbest_tuketici", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_serbest_tuketici", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "st_musteri_kodu")
    public String st_musteri_kodu;
    @Column(name = "st_adi")
    public String st_adi;
    @Column(name = "epdk_sektoru")
    public String epdk_sektoru;
    @Column(name = "hacim")
    public String hacim;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "istasyon_id")
    private Istasyon istasyon;
}

