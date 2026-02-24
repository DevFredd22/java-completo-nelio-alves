package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enuns.A025_Worker_Level;

public class A025_Worker {

	private String name;
	private A025_Worker_Level Level;
	private Double baseSalary;

	private A025_Department department;
	private List<A025_Hour_Contract> contracts = new ArrayList<>();

	public A025_Worker() {
	}

	public A025_Worker(String name, A025_Worker_Level level, Double baseSalary, A025_Department department) {
		this.name = name;
		this.Level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A025_Worker_Level getLevel() {
		return Level;
	}

	public void setLevel(A025_Worker_Level level) {
		this.Level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public A025_Department getDepartment() {
		return department;
	}

	public void setDepartment(A025_Department department) {
		this.department = department;

	}

	public List<A025_Hour_Contract> getContracts() {
		return contracts;
	}

	public void addContract(A025_Hour_Contract contract) {
		contracts.add(contract);
	}

	public void removeContract(A025_Hour_Contract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (A025_Hour_Contract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
