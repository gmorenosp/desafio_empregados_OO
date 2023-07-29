package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		System.out.print("Quantos funcionários tem o departamento? ");
		int N = sc.nextInt();

		Address address = new Address(email, phone);
		Department dept = new Department(name, payDay, address);

		for (int i = 0; i < N; i++) {

			System.out.printf("Dados do funcionário %d:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(employeeName, salary);

			dept.addEmployee(employee);

		}

		showReport(dept);

		sc.close();

	}

	public static void showReport(Department dept) {
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.printf("Departamento Vendas = R$ %.2f\n", dept.payroll());
		System.out.printf("Pagamento realizado no dia %d\n", dept.getPayDay());
		System.out.println("Funcionários:");

		for (Employee employee : dept.getEmployees()) {
			System.out.println(employee.getName());
		}

		System.out.printf("Para dúvidas favor entrar em contato: %s\n", dept.getAddress().getEmail());
	}

}
