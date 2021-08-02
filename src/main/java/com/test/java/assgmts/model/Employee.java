package com.test.java.assgmts.model;

public class Employee {
	private String eid;
	private String firstname;

	public Employee(String eid, String firstname, String lastname, double salary, String deparment) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.deparment = deparment;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	private String lastname;
	private double salary;
	private String deparment;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", deparment=" + deparment + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deparment == null) ? 0 : deparment.hashCode());
		result = prime * result + ((eid == null) ? 0 : eid.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (deparment == null) {
			if (other.deparment != null)
				return false;
		} else if (!deparment.equals(other.deparment))
			return false;
		if (eid == null) {
			if (other.eid != null)
				return false;
		} else if (!eid.equals(other.eid))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

}
