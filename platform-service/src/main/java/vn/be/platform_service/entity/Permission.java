package vn.be.platform_service.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERMISSIONS")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERMISSIONS_id_gen")
    @SequenceGenerator(name = "PERMISSIONS_id_gen", sequenceName = "PERMISSIONS_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED_AT")
    private Instant createdAt;

    @Column(name = "UPDATED_AT")
    private Instant updatedAt;


}