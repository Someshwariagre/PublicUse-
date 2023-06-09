package com.xworkz.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "person")

public class Person {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "address_id")
	    private Address address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

	   
	}



