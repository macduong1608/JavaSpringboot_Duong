package vn.be.platform_service.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_id_gen")
    @SequenceGenerator(name = "USERS_id_gen", sequenceName = "USERS_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "AGE")
    private Short age;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @Column(name = "CREATED_AT")
    private Instant createdAt;

    @Column(name = "UPDATED_AT")
    private Instant updatedAt;

    @Lob
    @Column(name = "ACCESS_TOKEN")
    private String accessToken;

    @Column(name = "AVATAR_URL")
    private String avatarUrl;

    @Column(name = "NAME")
    private String name;


}