package exceptions;

public  class BeansAmountException extends Exception {
        private double beans;

        public BeansAmountException(double beans, String message) {
            super(message + " " + beans);
            this.beans = beans;
        }

        public double getBeans() {
            return beans;
        }

        public void setBeans(double beans) {
            this.beans = beans;
        }
    }
