package com.harveey.userapi.domain;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import static lombok.EqualsAndHashCode.Include;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity(name = "TB_USER")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Include
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Double hourlyPrice;

}
