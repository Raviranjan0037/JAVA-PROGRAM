package sep19;

public class VaccinationSuccessful extends Vaccine {
    private boolean hasFirstDose = false;

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void firstDose() {
        super.firstDose();
        hasFirstDose = true;
    }

    @Override
    protected boolean hasFirstDose() {
        return hasFirstDose;
    }

    @Override
    public void boosterDose() {
        if (hasFirstDose) {
            System.out.println("Booster dose administered.");
        } else {
            System.out.println("You need to take the first dose before taking the booster dose.");
        }
    }
}