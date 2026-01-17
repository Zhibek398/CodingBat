package string1;

public class String1 {
    public static void main(String[] args) {

    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }


    public String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }
        return str.substring(0, str.length() / 2);
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String theEnd(String str, boolean front) {
        if (str.isEmpty()) {
            return "";
        }
        if (front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        } else {
            return false;
        }
    }

    public String middleThree(String str) {
        if (str.length() % 2 == 1 && str.length() >=3) {
            int middle =  str.length()/2;
            return str.substring(middle - 1, middle + 2);
        }else {
            return "String is empty";
        }
    }

    public String lastChars(String a, String b) {
        char first;
        char last;
        if (a.length() > 0){
            first = a.charAt(0);
        }else {
            first = '@';
        }
        if (b.length() > 0) {
            last = b.charAt(b.length() - 1);
        }else {
            last = '@';
        }
        return ""+first + last;
    }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")){
            return "blue";
        } else {
            return "";
        }
    }

    public String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }else if (str.length() == 1) {
            return str.substring(0,1)+ str.substring(0,1)+ str.substring(0,1);
        }else {
            return "";
        }
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()){
            return "";
        }
        String start = str.substring(1,word.length());
        if (start.equals(word.substring(1))){
            return str.substring(0,word.length());
        }
        return "";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length());

    }

    public String withoutEnd(String str) {
        int middle = (str.length() - 1);
        return str.substring(1,middle);
    }

    public String left2(String str) {
        if (str.length()>2){
            String firstletter = str.substring(0,2);
            String other = str.substring(2);
            return other + firstletter;
        } else{
            return str;
        }
    }

    public String withouEnd2(String str) {
        if (str.length() > 2) {
            int middle = str.length() - 1;
            return str.substring(1, middle);
        } else {
            return "";
        }
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public boolean hasBad(String str) {
        if (str.length()< 3 ){
            return false;
        }
        if (str.length() >= 3 && str.substring(0,3).equals("bad")){
            return true;
        }

        if (str.length() >= 4 && str.substring(1,4).equals("bad")){
            return true;
        } else{
            return false;
        }
    }

    public String conCat(String a, String b) {
        String newS = "";
        if(b.length() > 0 && a.endsWith(b.substring(0,1))){
            newS = a + b.substring(1, b.length());
        }  else {
            newS = a + b;
        }
        return newS;
    }

    public boolean frontAgain(String str) {
        boolean ed = false;
        if (str.length()== 1 || str.isEmpty()){
            ed = false;
        }
        else if (str.endsWith(str.substring(0,2))){
            ed = true;
        } else {
            ed = false;
        }
        return ed;
    }

    public String without2(String str) {
        String s = "";
        String s1 = "";
        if (str.length() > 2){
            s = str.substring(0,2);
            if (str.endsWith(s)){
                s1 = str.substring(2);
            } else {
                s1 = str;
            }
        } else if (str.length() == 1){
            return str;
        }
        return s1;
    }


}
