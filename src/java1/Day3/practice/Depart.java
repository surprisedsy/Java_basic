package java1.Day3.practice;

public class Depart extends Employee{

		String department = "";
		
		public Depart(String depart)
		{
			this.department = depart;
		}
		
		public Depart(String name, int salary, String depart)
		{
			super(name, salary);
			this.department = depart;
		}
		
		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void getInfomaiton()
		{
			//setDepartment("��ȹ��");
			System.out.println("�̸� : " + getName() + " ���� : " + getSalary() + " �μ� : " + this.department);
		}
}
