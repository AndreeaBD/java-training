package Builder;

public class Person {
    private String name;
    private String job;
    private String university;
    public String drivingLicense;
    public boolean isMarried;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.job = personBuilder.getJob();
        this.university = personBuilder.getUniversity();
        this.drivingLicense = personBuilder.getDrivingLicense();
        this.isMarried = personBuilder.isMarried();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static class PersonBuilder {
        private String name;
        private String job;
        private String university;
        public String drivingLicense;
        public boolean isMarried;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public PersonBuilder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getJob() {
            return job;
        }

        public String getUniversity() {
            return university;
        }

        public String getDrivingLicense() {
            return drivingLicense;
        }

        public boolean isMarried() {
            return isMarried;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
