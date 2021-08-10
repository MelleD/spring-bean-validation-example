package com.example.demo.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FooBarId implements Serializable {

	@Column(name = "foo_id")
	private Long fooId;

	@Column(name = "bar_id")
	private Long barId;

	public Long getFooId() {
		return fooId;
	}

	public void setFooId(Long fooId) {
		this.fooId = fooId;
	}

	public Long getBarId() {
		return barId;
	}

	public void setBarId(Long barId) {
		this.barId = barId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barId == null) ? 0 : barId.hashCode());
		result = prime * result + ((fooId == null) ? 0 : fooId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final FooBarId other = (FooBarId) obj;
		if (barId == null) {
			if (other.barId != null) {
				return false;
			}
		} else if (!barId.equals(other.barId)) {
			return false;
		}
		if (fooId == null) {
			if (other.fooId != null) {
				return false;
			}
		} else if (!fooId.equals(other.fooId)) {
			return false;
		}
		return true;
	}

}
