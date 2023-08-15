package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "s_tuketici")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class STuketici {
    @Id
    @SequenceGenerator(name = "seq_s_tuketici", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_s_tuketici", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "st_adi")
    public String st_adi;

    @Column(name = "epdk_sektoru")
    public String epdk_sektoru;

    @Column(name = "hacim")
    public String hacim;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "istasyon_id")
    private Istasyon istasyon;

}
