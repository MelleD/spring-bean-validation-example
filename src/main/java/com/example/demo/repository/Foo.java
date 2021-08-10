package com.example.demo.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Foo {

	@Id
	private Long id;

	@OneToMany(mappedBy = "foo")
	private List<FooBar> fooBars;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FooBar> getFooBars() {
		return fooBars;
	}

	public void setFooBars(List<FooBar> fooBars) {
		this.fooBars = fooBars;
	}

}
