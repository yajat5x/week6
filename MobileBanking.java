interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceAuthentication();
}

class BankingApplication implements AdvancedSecurity {

    public void login() {
        System.out.println("Login successful");
    }

    public void logout() {
        System.out.println("Logout successful");
    }

    public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful");
    }

    public void faceAuthentication() {
        System.out.println("Face recognition authentication successful");
    }
}

public class MobileBanking {
    public static void main(String[] args) {

        BankingApplication app = new BankingApplication();

        app.login();
        app.fingerprintAuthentication();
        app.faceAuthentication();
        app.logout();
    }
}