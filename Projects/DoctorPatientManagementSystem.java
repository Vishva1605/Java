import java.util.Scanner;

class Doctor {
    private String name;
    private String specialization;
    private Patient[] patients;
    private int patientcount;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new Patient[3];
        this.patientcount = 0;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void addPatient(Patient p) {
        if (patientcount < 3) {
            patients[patientcount++] = p;
            p.addDoctor(this);
        } else {
            System.out.println("Maximum Patients Reached for Doctor " + name);
            System.out.println();
        }
    }

    public void printPatients() {
        System.out.println("Doctor " + name + "'s Patient Details");
        System.out.println("------------------------------------");
        for (int i = 0; i < patientcount; i++) {
            System.out.println("Patient_Name : " + patients[i].getName() + " || Patient_Age : " + patients[i].getAge());
        }
        System.out.println("------------------------------------");
    }
}

class Patient {
    private String name;
    private int age;
    private Doctor[] doctors;
    private int doctorcount;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new Doctor[3];
        this.doctorcount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addDoctor(Doctor d) {
        if (doctorcount < 3) {
            doctors[doctorcount++] = d;
        } else {
            System.out.println("Maximum Doctors Reached for Patient " + name);
            System.out.println();
        }
    }

    public void printDoctors() {
        System.out.println("Patient " + name + "'s Doctor Details");
        System.out.println("-------------------------------------");
        for (int i = 0; i < doctorcount; i++) {
            System.out.println("Doctor_Name : " + doctors[i].getName() + " || Doctor_Specialization : " + doctors[i].getSpecialization());
        }
        System.out.println("-------------------------------------");
    }
}

public class DoctorPatientManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Doctor[] doctors = new Doctor[3];
        for (int i = 0; i < doctors.length; i++) {
            System.out.print("Enter Doctor " + (i + 1) + " Name: ");
            String dname = sc.nextLine();
            System.out.print("Enter Doctor " + (i + 1) + " Specialization: ");
            String spec = sc.nextLine();
            doctors[i] = new Doctor(dname, spec);
        }

        Patient[] patients = new Patient[3];
        for (int i = 0; i < patients.length; i++) {
            System.out.print("Enter Patient " + (i + 1) + " Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Patient " + (i + 1) + " Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            patients[i] = new Patient(pname, age);
        }

        
        doctors[0].addPatient(patients[0]);
        doctors[0].addPatient(patients[1]);
        doctors[0].addPatient(patients[2]);

        doctors[1].addPatient(patients[0]);
        doctors[1].addPatient(patients[2]);

        doctors[2].addPatient(patients[0]);
        doctors[2].addPatient(patients[1]);

        // Print doctor → patients
        for (Doctor d : doctors) {
            d.printPatients();
        }

        // Print patient → doctors
        for (Patient p : patients) {
            p.printDoctors();
        }

        sc.close();
    }
}
