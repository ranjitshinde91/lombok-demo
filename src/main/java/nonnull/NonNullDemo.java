package nonnull;

import lombok.NonNull;


public class NonNullDemo {


    public static void main(String[] args) {
        Student ranjit = new Student();
        ranjit.setFirstname(null);
        ranjit.print();
    }

    private static class Student {

        private String firstname;


        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(@NonNull String firstname) {
            this.firstname = firstname;
        }

        public void print(){
            System.out.println("Name "+firstname);
        }
    }

}



