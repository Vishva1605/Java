class Doctor{
    private String name;
    private String specialization;
    private Patient[] patients;
    private int patientcount;

    public Doctor(String name,String specialization){
        this.name = name;
        this.specialization = specialization;
        this.patients = new Patient[3];
        this.patientcount = 0;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }

    public void addPatient(Patient p){
        if(patientcount<3){
            patients[patientcount++] = p;
            p.addDoctor(this);
        }else{
            System.out.println("Maximum Patients Reached for Doctor "+name);
            System.out.println();
        }
    }

    public void printPatients(){
        System.out.println("Doctor "+name+"'s Patient Details");
        System.out.println("------------------------------------");
        for(int i=0;i<patientcount;i++){
            System.out.println("Patient_Name : "+patients[i].getName()+" || Patient_Age : "+patients[i].getAge());
        }
        System.out.println("------------------------------------");
    }
}

class Patient{
    private String name;
    private int age;
    private Doctor[] doctors;
    private int doctorcount;

    public Patient(String name,int age){
        this.name = name;
        this.age = age;
        this.doctors = new Doctor[3];
        this.doctorcount = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void addDoctor(Doctor d){
        if(doctorcount<3){
            doctors[doctorcount++] = d;
            // d.addPatient(this);
        }else{
            System.out.println("Maximum Doctors Reaches for Patient "+name);
            System.out.println();
        }
    }
    public void printDoctors(){
        System.out.println("Patient "+name+"'s Doctor Details");
        System.out.println("-------------------------------------");
        for(int i=0;i<doctorcount;i++){
            System.out.println("Doctor_Name : "+doctors[i].getName()+" || Doctor_Specialization : "+doctors[i].getSpecialization());
        }
        System.out.println("-------------------------------------");
    }
}
public class DoctorPatientManagementSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr.Smith", "Cardiologist");
        Doctor d2 = new Doctor("Dr.Priya", "Neurologist");
        Doctor d3 = new Doctor("Dr.ponnu", "Dermatologist");

        Patient p1 = new Patient("Ravi", 45);
        Patient p2 = new Patient("Meena", 60);
        Patient p3 = new Patient("Mano",21);

        d1.addPatient(p1);d1.addPatient(p2);d1.addPatient(p3);
        d2.addPatient(p1);d2.addPatient(p3);
        d3.addPatient(p1);d3.addPatient(p2);

        d1.printPatients();
        d2.printPatients();
        d3.printPatients();

        p1.printDoctors();
        p2.printDoctors();
        p3.printDoctors();
        

    //     p1.addDoctor(d1);
    //     p1.addDoctor(d2);
    //     p2.addDoctor(d1);
    //     p3.addDoctor(d1);
    //     p3.addDoctor(d3);

    //     p1.printDoctors();
    //     p2.printDoctors();
    //     p3.printDoctors();

    //     d1.printPatients();
    //     d2.printPatients();
    //     d3.printPatients();
    // 
    }
}
