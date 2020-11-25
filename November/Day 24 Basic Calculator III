public static int calculate(String s) {
    int md=-1; // 0 is multiplication, 1 is division
    int sign=1; // 1 is +, -1 is -
    int prev=0;
    int result=0;
 // _3*10-2+5_
    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(Character.isDigit(c)){
            int num = c-'0'; // str8 away convert to char Integer to int
            while(++i<s.length() && Character.isDigit(s.charAt(i))){ //to determine if there is consecutive number or not.
                num = num*10+s.charAt(i)-'0';
            }
            i--; // back to last digit of number
            if(md==0){
                prev = prev * num;
                md=-1;
            }else if(md==1){
                prev = prev / num;
                md=-1;
            }else{
                prev = num;
            }
        }else if(c=='/'){
            md=1;
        }else if(c=='*'){
            md=0;
        }else if(c=='+'){
            result = result + sign*prev; //change the sign to positive
            sign=1;
        }else if(c=='-'){
            result = result + sign*prev; //change the sign to negative
            sign=-1;
        }
    }
 
    result = result + sign*prev;
    return result;
}
