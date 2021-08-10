package com.example.demo.repository;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class FooBar {

	@EmbeddedId
	private FooBarId id;

	@ManyToOne
	@JoinColumn(name = "bar_id")
	@MapsId("barId")
	private Bar bar;

	@ManyToOne
	@JoinColumn(name = "foo_id")
	@MapsId("fooId")
	private Foo foo;

	public FooBarId getId() {
		return id;
	}

	public void setId(FooBarId id) {
		this.id = id;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

}
