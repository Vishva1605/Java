package Encapsulation;
class Locker{
    private boolean islocked;
    private String password;
//constructors
    public Locker(){
        this.islocked = false;
        this.password = "";
    }
//getters
    public boolean getIsLocked(){
        return islocked;
    }
    public String getPassword(){
        return password;
    }
//methods
    public void lock(String newpassword){
        if(!islocked){
            if(newpassword.length()>=8 && newpassword.length()!=0){
                this.password = newpassword;
                islocked = true;
                System.out.println("Password Created");
                System.out.println("Device Locked");
            }else
                System.out.println("password must be atleast 8 Caharacters");
        }else
            System.out.println("Already Locked");
        System.out.println();
    }
    public void unlock(String unlockpassword){
        if(this.password.equals(unlockpassword)){
            islocked = false;
            System.out.println("Device Unlocked");
        }else
            System.out.println("Wrong Passoword");
        System.out.println();
    }
    public void checkstatus(){
        if(this.password.length()>=8)
            System.out.println("Locker is : "+(islocked?"Yes Locked":"Not Locked"));
        else
            System.out.println("Create Password");
        System.out.println();
    }
}
public class SecureLockerSystem {
    public static void main(String[] args) {
        Locker l1 = new Locker();

        l1.checkstatus();
        l1.lock("password");
        //l1.unlock("password");
        l1.checkstatus();
    }
}
