package oop.class_objects;

public class LapTop {

        public String mark = "tahir";
        protected String color;
        double price;
        StringBuilder reversedMark = new StringBuilder(mark);
        public StringBuilder conditionOfTask() {
            System.out.println(reversedMark);
            return reversedMark.reverse();
        }
        public boolean checkTask() {
            StringBuilder reverseMark2 = new StringBuilder(mark);
            reverseMark2 = reverseMark2.reverse();
            if (reverseMark2.toString().equals(reversedMark.toString())) {
                return true;
            }
            return false;
        }
    }


//    public class ClassObjects2 {
//        public static void main(String[] args) {
//            //LapTop hp = new LapTop();
//            System.out.println(hp.conditionOfTask());
//            System.out.println(hp.checkTask());
//        }

