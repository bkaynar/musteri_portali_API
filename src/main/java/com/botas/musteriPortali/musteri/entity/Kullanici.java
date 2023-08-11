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
    private Long id;

    @Column(name = "kullanici_adi")
    private String kullanici_adi;
    @Column(name = "kullani_mail")
    private String kullanici_mail;
    @Column(name = "kullanici_sifre")
    private String kullanici_sifre;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;

}
