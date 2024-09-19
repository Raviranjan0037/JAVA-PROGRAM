package sep19;

public class Vaccination {
    public static void main(String[] args) {
        VaccinationSuccessful vaccination = new VaccinationSuccessful(25, "Indian");

        vaccination.firstDose();
        vaccination.secondDose();
        vaccination.boosterDose();

        VaccinationSuccessful vaccination2 = new VaccinationSuccessful(17, "Indian");
        vaccination2.firstDose();
        vaccination2.secondDose();
        vaccination2.boosterDose();
    }
}