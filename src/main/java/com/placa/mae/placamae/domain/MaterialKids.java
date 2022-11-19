package com.placa.mae.placamae.domain;

import java.util.Objects;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "materialKids", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"title"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MaterialKids {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long kidsId;
		@Column(name = "title", length = 25, nullable = false)
		private String title;



		@Override
		public boolean equals(Object obj) {
			if(this == obj){
				return true;
			}
			if(obj instanceof MaterialKids) {
				MaterialKids other = (MaterialKids) obj;
				return Objects.equals(title, other.title);
			}
			return false;
		}
		
}
