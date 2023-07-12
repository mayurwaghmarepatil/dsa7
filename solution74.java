public class solution74 {
    public String reverseWords(String s) {
        String[] strArray =s.split(" ");
        s="";
        for (int i = 0; i< strArray.length; i++){
            String str= strArray[i],nstr="";
            char ch;
            for (int j=0; j<str.length(); j++)
            {
                ch= str.charAt(j);
                nstr= ch+nstr;
            }
            s+=" "+nstr;
        }
        return s.trim();
    }

    public static void main(String[] args) {
        solution74 s74=new solution74();
        System.out.println(s74.reverseWords("Let's take LeetCode contest"));
    }

        }
