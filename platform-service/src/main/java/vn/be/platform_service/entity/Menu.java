package vn.be.platform_service.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MENUS")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MENUS_id_gen")
    @SequenceGenerator(name = "MENUS_id_gen", sequenceName = "MENUS_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "PATH")
    private String path;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @ColumnDefault("0")
    @Column(name = "ORDER_INDEX")
    private Integer orderIndex;

    @Column(name = "VISIBLE")
    private Boolean visible;

    @Column(name = "CREATED_AT")
    private Instant createdAt;

    @Column(name = "UPDATED_AT")
    private Instant updatedAt;


}