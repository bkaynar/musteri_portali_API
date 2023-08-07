package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Lazy;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "fatura")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Fatura implements Serializable {
    @Id
    private Long Id;

    @Column(name = "yil", length = 4)
    private int yil;

    @Column(name = "ay", length = 2)
    private int ay;

    @Column(name = "tutar" )
    private BigDecimal tutar;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "musteri_fatura_id")
    private Musteri musteri;//Burası Foreign Key Oluşturuyor

}
