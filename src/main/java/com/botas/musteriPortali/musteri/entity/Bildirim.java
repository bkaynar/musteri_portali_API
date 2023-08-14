package com.botas.musteriPortali.musteri.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "bildirim")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Bildirim implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_bildirim", initialValue = 1, allocationSize = 50)
    @GeneratedValue(generator = "seq_bildirim", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "bildirim_tipi", length = 10)
    private String bildirim_tipi;
}
