interface Confidential {
    
}

class Report {
    String name;

    Report(String name) {
        this.name = name;
    }
}

class FinancialReport extends Report implements Confidential {

    FinancialReport(String name) {
        super(name);
    }
}

class PublicDocument extends Report {

    PublicDocument(String name) {
        super(name);
    }
}

public class DocumentManagement {
    public static void main(String[] args) {

        Report d1 = new FinancialReport("Company Financial Report");
        Report d2 = new PublicDocument("Public Notice");

        if (d1 instanceof Confidential) {
            System.out.println(d1.name + " is Confidential");
        } else {
            System.out.println(d1.name + " is not Confidential");
        }

        if (d2 instanceof Confidential) {
            System.out.println(d2.name + " is Confidential");
        } else {
            System.out.println(d2.name + " is not Confidential");
        }
    }
}