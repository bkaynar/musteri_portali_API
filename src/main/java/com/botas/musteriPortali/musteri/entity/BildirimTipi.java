package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "bildirim_tipi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class BildirimTipi implements Serializable {
    @Id
    private Long Id;

    @Column(name = "bildirim_tipi")
    private String bildirimTipi;


}
