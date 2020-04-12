import java.util.ArrayList;

/**
 * @author josh
 *@version 26/10/19
 */
public class Salaries {

	private ArrayList<double[]> allSalaries;

	public Salaries() {
		allSalaries = new ArrayList<>();
	}

	public void add(double[] employeeSalaries) {
		allSalaries.add(employeeSalaries);
	}

	/**
	 * find the average of empolyee salaries
	 */
		public static double average(double[] employeeSalaries) {
			double sum =0;
			double count = 0;

			for (int i= 0; i< employeeSalaries.length; i++) {
				if (employeeSalaries[i] != 0) {
					sum += employeeSalaries[i];
					count++;
				}
			}
			if (sum == 0) {
				throw new IllegalArgumentException();
			}
				return sum / count;
			}
		/**
		 * crate an array list of average salaries
		 */
		public ArrayList<Double> averageSalaries(){

			ArrayList<Double> averageSalaries = new ArrayList<>();
				for (double[] salaries : allSalaries) {
					try{
						double avg = average(salaries);
						averageSalaries.add(avg);
					}
					catch (IllegalArgumentException e){}
				}
				return averageSalaries;
		}
		/**
		 * convert arraylists to doubles
		 */
		private static double[] convert(ArrayList<Double> arr) {
			double[] list = new double[arr.size()];
			int count =0;
			for (double element : arr) {
				list[count]= element;
				count ++;
			}
			return list;
		}
		/**
		 * test if employee salary is three times higher then overall average salary
		 */
		public boolean not3TimesHigher() {
			double overallsalary =0;
			double[] averageSalaries = {};
			try { overallsalary = average(convert(averageSalaries()));
			 averageSalaries = convert(averageSalaries());
			}
			catch (IllegalArgumentException e){}

			for (double salary: averageSalaries) {
				if (salary > (3 * overallsalary)){
					return false;
				}}
			
			return true;
		} 


	public static void main(String[] args) {
			Salaries tesco = new Salaries();
			double[] johnSalary = { 1000, 1000, 2000, 2000, 0, 0, 0, 0, 0, 0, 0, 0 };
			double[] marySalary = { 1000, 1000, 2000, 2000, 1320, 2110, 1350, 1400, 1600, 2200, 1100, 1450 };
			double[] jackSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1400 };
			double[] anneSalary = { 0, 1000, 0, 2000, 0, 2110, 1350, 1400, 0, 0, 0, 0 };
			tesco.add(johnSalary);
			tesco.add(marySalary);
			tesco.add(jackSalary);
			tesco.add(anneSalary);
		
			double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			Salaries salaries2 = new Salaries();
			salaries2.add(noSalary);
			System.out.println(tesco.averageSalaries());

			System.out.println(salaries2.not3TimesHigher());

	}

}
