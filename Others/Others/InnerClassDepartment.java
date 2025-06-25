package Others.Others;
class University{
    static class Department{
        void cseDept(){}
        void itDept(){}
    }
}
class CseDept extends University.Department{
    @Override
    void cseDept(){
        System.out.println("this is a cse dept");;
    }
    @Override
    void itDept(){
        System.out.println("this is an it department");
    }
}
class InnerclassDepartment{
    public static void main(String[] args) {
        CseDept c = new CseDept();
        c.cseDept();
        c.itDept();

    }
}
