package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="musteri")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Musteri implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_musteri", initialValue = 1,allocationSize = 50 )
    @GeneratedValue(generator = "seq_musteri", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 10, name="musteriKod")
    public String musteriKod;
    @Column(length = 200, name="musteriAdi")
    public String musteriAdi;
    @Column(length = 500, name = "adres")
    public  String adress;
    @Column(length = 50, name = "il")
    public  String il;
    @Column(length = 100, name = "ilce")
    public  String ilce;
    @Column(length = 15, name = "telefon")
    public  String telefon;



}
