package DomaciSreda5;


    public class Square extends Rectangle {


        public Square(String name, double a, double b) {
            super(name, a, b);

        }


        @Override
        public double circumference() {

            return 2 * (getA() + getB());
        }


        @Override
        public double area() {

            return getA() * getB();
        }


        @Override
        public String toString() {
            return super.toString();
        }


    }

