class Solution {
    int i=0;
    public String decodeString(String s) {
       StringBuilder str=new StringBuilder();
    int count=0;
    String tmp="";
    while (i<s.length()){
        char c=s.charAt(i);
        i++;
        if (c=='[') {
            tmp=decodeString(s);
            for(int j=0;j<count;j++){
                str.append(tmp);
            }
            count=0;
        }
        else if(c==']'){
            break;
        } else if(Character.isAlphabetic(c)){
            str.append(c);
        } else{
            count=count*10+c-'0';
        }
    }
    return str.toString();  
    }
}
