public class PracticeProblem {

	public static void main(String args[]) {

	}

public static String triangle(int num) {
    String word = "";
    
    for (int i = 1; i <=num; i++) {
        for (int j = 1; j <= i; j++) {
            word += "*";
        }
        if (i <= num) {
            word += "\n";
        }
    }
    
    return word;
}
public static String pyramid(int n) {
    String result = "";
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            result += " ";
        }
        
        for (int k = 1; k <= i; k++) {
            result += "*";
            if (k < i) {
                result += " ";
            }
        }
        if (i <= n) {
            result += "\n";
        }
    }
    
    return result;
}
public static String multiplicationTable(int num){
String word="";
 for(int i=1;i<=num;i++){
    for(int j=1;j<=num;j++){
       word+=(j*i);
    if(j<num){
        word+=(" ");
    }
    
 }
 if(i<=num){
    word+="\n";
 }

}
return word;

}}
