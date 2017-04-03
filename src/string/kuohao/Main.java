package string.kuohao;
/**
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
测试样例：
"(()())",6
返回：true
 * @author liukunsheng
 *
 */
public class Main {
    public boolean chkParenthesis(String A, int n) {
    	int num=0;
    	char [] strs=A.toCharArray();
    	for(int i=0;i<strs.length;i++){
    		if(strs[i]=='('){
    			num++;
    		}
    		if(strs[i]==')'){
    			num--;
    		}
    		if(num<0){
    			return false;
    		}

    	}
    	if(num!=0){
    		return false;
    	}else{
        	return true;

    	}
    }
}
