public enum ChoseSubject {
    COMPUTER_SIENCE,
    CHEMISTRY,
    ENGLISH,
    OTHER;
    String outputSallarySubject() {
        switch (this) {
            case COMPUTER_SIENCE:
                System.out.println("ComputerSience" + " " + "10k");
            case CHEMISTRY:
                System.out.println("Chemistry" + " " + "5k");
            case ENGLISH:
                System.out.println("English" + " " + "2.5k");
            case OTHER:
                System.out.println("other" + " " + "1k");
        }
        return "vseNorm";
    }
}
