public class Main {
    public static void main(String[] args) {
        Patient p_adam=new Patient("123456789","Adam","10/10/2000");
        p_adam.assign_patient_condition("Asthma");
        double adam_fees=Patient.calculate_patient_fees("emergency","5");
        System.out.println("your fees are "+adam_fees);

        Patient p_nana=new Patient("514","Nana","07/08/2002");
        p_nana.assign_patient_condition("Arthritis, Insulin Resistance");
        double nana_fees=Patient.calculate_patient_fees("regular","4");
        System.out.println("your fees are "+nana_fees);

    }
}