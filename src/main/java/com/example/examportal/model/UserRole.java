package com.example.examportal.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Data
@Entity
@Table(name="UserRole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;


    @ManyToOne(fetch = FetchType.EAGER)

    private User user;

    @ManyToOne(fetch = FetchType.EAGER)

    private Role role;


}
