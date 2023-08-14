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
    @SequenceGenerator(name = "seq_istasyon", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_istasyon", strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "istasyon_adi", length = 50)
    private String istasyon_adi;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;
}
