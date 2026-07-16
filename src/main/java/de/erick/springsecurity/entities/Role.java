package de.erick.springsecurity.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_roles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")

    private Long roleId;

    private String name;

    public enum Values {

        ADMIN(1L),
        BASIC(2L);

        private final long roleid;

        Values(long roleid) {
            this.roleid = roleid;
        }

        public long getRoleid() {
            return roleid;
        }
    }
}
