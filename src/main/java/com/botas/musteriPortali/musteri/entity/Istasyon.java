package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "istasyon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Istasyon {
    @Id
    private Long id;

    @Column(name = "istasyon_adi")
    private String istasyonAdi;

    //Müşteri ID Foreign Key Olarak Gelecek
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;

}
