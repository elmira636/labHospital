import java.util.*;

public class Patient extends Person{
    String insurance_number;
    List<String> past_conditions;
    static double min_copay=10;
    protected String get_ID()
    {
        return insurance_number;
    }
    Patient()
    {
past_conditions=new ArrayList<>();
    }
    Patient(String p_ssn, String p_name, String p_DOB)
    {
SSN=p_ssn;
name=p_name;
DOB=p_DOB;
    }
    static double calculate_patient_fees(String visit_type, int no_hours) {
        double fees = 0;
        if (visit_type.equals("regular")) {
            //calc fees of reg
        } else if (visit_type.equals("emergency")) {
            //calc fees of emergency
        }

        return fees - min_copay;
    }
            void assign_patient_condition(String condition)
        {
            past_conditions.add(condition);
        }

}
