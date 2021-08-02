package com.test.java.assgmts.model;

public class Emp {
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Emp(int eid, String firstname, String lastname, String department) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}

	private int eid;
	private String firstname;
	private String lastname;

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", department=" + department
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + eid;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		Emp other = (Emp) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (eid != other.eid)
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
		return true;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String department;

	
	/*public int compareTo(Emp o) {
		if (this.getEid() > o.getEid()) {
			return 1;
		} else if (this.getEid() < o.getEid()) {
			return -1;
		}
		return 0;
	}*/
}
