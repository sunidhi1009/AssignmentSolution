class Doctor {
void diagonose() {
	System.out.println("Doctor diaagonising ENT");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
Doctor d = new Doctor();
d.diagonose();
HeartSurgeon s = new HeartSurgeon();
s.diagonose();

}
}
class Surgeon extends Doctor{
	void diagonose() {
		System.out.println("surgeon  diaagonising Ray");
	}
	
}
 class HeartSurgeon extends Doctor{
	void diagonose() {
		System.out.println("Heartsurgeon  diaagonising ECG");
	}
	
 

}
