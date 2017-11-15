public enum ChoseMajor {
    ELECTRICAL_ENGENEER,
    COMMUNICATORS,
    UNDECLEARED;
    String outputMajorYear() {
        switch (this) {
            case ELECTRICAL_ENGENEER:
                System.out.println("Electrical Engeneer" + " " + "1");
            case COMMUNICATORS:
                System.out.println("communicator" + " " + "3");
            case UNDECLEARED:
                System.out.println("Undecleared" + " " + "5");

        }
        return "vseNorm";
    }
}
