
public class VaccinationTest {
   
	
	
	public static void main(String[] args) {
	Vaccine vc = new Covisheild();
	vc.Vaccinated();
	
	Vaccine vc1 = new Covaxin();
	vc1.Vaccinated();
	
	}

}
interface Vaccine
{
	void Vaccinated();
}
class Covisheild implements Vaccine
{
	public void Vaccinated() {
		System.out.println("Vaccinated using Covisheild");
	}
}
class Covaxin implements Vaccine
{
	public void Vaccinated() {
		System.out.println("Vaccinated using Covaxin");
	}
}
class Sputnik implements Vaccine
{public void Vaccinated() {
	System.out.println("Vaccinated using Sputnik");
}
	
}