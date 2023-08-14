package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kullanici")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Kullanici {
    @Id
    @SequenceGenerator(name = "seq_kullanici", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_kullanici", strategy = GenerationType.SEQUENCE)
    private Long Id;
    @Column(name = "kullanici_adi", length = 50)
    private String kullanici_adi;
    @Column(name = "kullanici_mail", length = 100)
    private String kullanici_mail;
    @Column(name = "kullanici_sifre", length = 100)
    private String kullanici_sifre;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;
}
