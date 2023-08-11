package com.botas.musteriPortali.musteri.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long id;

    @Column(name = "bildirim_tipi", length = 10)
    private String bildirim_tipi;
}
