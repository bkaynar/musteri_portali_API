package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "tehis")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Tehis {
    @Id
    @SequenceGenerator(name = "seq_tehis", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_tehis", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "imza_tarihi")
    public Date imza_tarihi;
    @Column(name = "baslangic_tarihi")
    public Date baslangic_tarihi;
    @Column(name = "bitis_tarihi")
    public Date bitis_tarihi;
    //Serbets Tuketici ID Foreign Key Gelecek
    @ManyToOne
    @JoinColumn(name = "serbest_tuketici_id")
    private STuketici serbestTuketici;//Burası Foreign Key Oluşturuyor
}
