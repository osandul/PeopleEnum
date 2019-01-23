

    /*TASK 1 ENUMs:
переделать домашнее задание урок №4, НО в университете должны быть предопределенные:
 - список факультетов
 - список курсов
 - список групп
при этом должна быть возможность распечатать эти списки отдельно - т.е. три метода которые будут возвращать списки всех:
 - факультетов
 - курсов
 - групп
попробуйте использовать несколько типов enum-ов (чтоб внутри были поля)
*/
    public enum Faculty {
        FITKI("Gates", 5),
        IIM("Yamchinska", 6),
        FOREIGN_LANGUAGES("Petrov", 4),
        CYBER_SECURITY("Koval", 6);

        private String principle;
        private int durationYears;

        public String getPrinciple() {
            return principle;
        }

        public void setPrinciple(String principle) {
            this.principle = principle;
        }

        public int getDurationYears() {
            return durationYears;
        }

        public void setDurationYears(int durationYears) {
            this.durationYears = durationYears;
        }

        Faculty(String principle, int durationYears) {
            this.principle = principle;
            this.durationYears = durationYears;

        }

        @Override
        public String toString() {
            return "Faculty{" +
                    "principle='" + principle + '\'' +
                    ", durationYears=" + durationYears +
                    '}';
        }
    }


