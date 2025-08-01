package org.spring.mvc.lesson44springdata.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name = "addres")
@Entity
@AllArgsConstructor
@Getter @Setter
public class AddresEntity {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;

    public AddresEntity() {
    }
}
