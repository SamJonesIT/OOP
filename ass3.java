class Employee {

    //variables
    String Designation, Emp_name, Address, Mail_id;
    int Emp_id, Mobile_no;
    float BP, HRA, PF, CF, grossSalary, netSalary, DA;

    //constructor
    Employee(
        String Designation,
        String Emp_name,
        String Address,
        String Mail_id,
        int Emp_id,
        int Mobile_no,
        float BP
    ) {
        this.Designation = Designation;
        this.Emp_name = Emp_name;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.Emp_id = Emp_id;
        this.Mobile_no = Mobile_no;
        this.BP = BP;
    }

    void Salary() {
        DA = BP * 97/100;
        HRA = BP * 10/100;
        PF = BP * 12/100;
        CF = BP * 1/1000;
        grossSalary = BP + DA + HRA + PF + CF;
        netSalary = BP + DA + HRA - PF - CF;
        System.out.println("Designation: " + Designation);
        System.out.println("    Employee Name: " + Emp_name);
        System.out.println("    Address: " + Address);
        System.out.println("    Mail id: " + Mail_id);
        System.out.println("    Employee id: " + Emp_id);
        System.out.println("    Mobile no: " + Mobile_no);
        System.out.println("    Gross Salary: " + grossSalary);
        System.out.println("    Net Salary: " + netSalary);
    }

}

class Programmer extends Employee {
    Programmer(
        String Designation,
        String Emp_name,
        String Address,
        String Mail_id,
        int Emp_id,
        int Mobile_no,
        float BP
    ) {
        super(
            Designation,
            Emp_name,
            Address,
            Mail_id,
            Emp_id,
            Mobile_no,
            BP
        );
    }

    void receipt() {
        Salary();
    }
}

class TeamLead extends Employee {
    TeamLead(
        String Designation,
        String Emp_name,
        String Address,
        String Mail_id,
        int Emp_id,
        int Mobile_no,
        float BP
    ) {
        super(
            Designation,
            Emp_name,
            Address,
            Mail_id,
            Emp_id,
            Mobile_no,
            BP
        );
    }

    void receipt() {
        Salary();
    }
}

class AsstProjectManager extends Employee {
    AsstProjectManager(
        String Designation,
        String Emp_name,
        String Address,
        String Mail_id,
        int Emp_id,
        int Mobile_no,
        float BP
    ) {
        super(
            Designation,
            Emp_name,
            Address,
            Mail_id,
            Emp_id,
            Mobile_no,
            BP
        );
    }

    void receipt() {
        Salary();
    }
}

class ProjectManager extends Employee {
    ProjectManager(
        String Designation,
        String Emp_name,
        String Address,
        String Mail_id,
        int Emp_id,
        int Mobile_no,
        float BP
    ) {
        super(
            Designation,
            Emp_name,
            Address,
            Mail_id,
            Emp_id,
            Mobile_no,
            BP
        );
    }

    void receipt() {
        Salary();
    }
}

class Main3 {
    public static void main(String[] args) {

        Programmer p = new Programmer(
            "Programmer",
            "Hemant",
            "Dhule",
            "hemant@example.com",
            50,
            256250,
            50000);
        p.receipt();

        TeamLead t = new TeamLead(
            "Team Leader",
            "Harshad",
            "Pandharpur",
            "harshad@example.com",
            51,
            256251,
            60000);
        t.receipt();

        AsstProjectManager a = new AsstProjectManager(
            "Assistant Project Manager",
            "Omkar",
            "Pune",
            "omkar@example.com",
            52,
            256252,
            70000);
        a.receipt();

        ProjectManager m = new ProjectManager(
            "Project Manager",
            "Shreyash",
            "Nashik",
            "shreyash@example.com",
            53,
            256253,
            80000);
        m.receipt();

    }
}
