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
