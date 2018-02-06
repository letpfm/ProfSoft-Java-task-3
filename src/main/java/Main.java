public class Main {

    public static void main(String[] args) {
        String input = "saippuakivikauppias";
//        String input = "";
//        String input = "p";
//        String input = "profsoftcorp";
        if(input.length()<2){
            System.out.println("Эта строка палиндром.");
        }else{
            for (int i = 0; i<input.length()/2; i++){
                if(input.charAt(i) == input.charAt(input.length()-i-1)){
                    if(i == input.length()/2-1){System.out.println("Эта строка палиндром.");}
                }else{
                    System.out.println("Эта строка НЕ палиндром.");
                    break;
                }
            }
        }
    }
}
