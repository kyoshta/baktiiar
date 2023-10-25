package coding_bat;

public class String1 {
    public static void main(String[] args) {
        String1 object = new String1();
        System.out.println(object.firstTwo(""));

    }

        public String firstTwo(String str) {
            if (str.length()<2){
                return str.substring(0,1);
            }
            else if (str.length()<1){
                return "";

            }
            else {
                return str.substring(0,2);
            }
        }

    }



