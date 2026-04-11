// Interface
interface Bank {
    double getInterestRate();
}

// SBI class implementing Bank
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class implementing Bank
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI class implementing Bank
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
