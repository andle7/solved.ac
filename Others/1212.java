import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위해 Scanner 객체 생성
        String s = sc.next();  // 사용자로부터 문자열 입력 받기
        int sum=0;  // 합을 계산하기 위한 변수 초기화
        int len=s.length();  // 입력된 문자열의 길이 저장
        StringBuilder sb = new StringBuilder();  // 문자열을 빌드하기 위한 StringBuilder 객체 생성
        for (int i = 0; i < s.length(); i++) {  // 문자열의 각 문자에 대해서 반복
            String a = Integer.toBinaryString(s.charAt(i)-'0');  // 해당 문자를 이진수로 변환하여 문자열 a에 저장
            if(a.length()==2 && i!=0) a="0"+a;  // 이진수의 길이가 2이고 첫 번째 문자가 아니면 앞에 0을 추가
            else if(a.length()==1 && i!=0) a="00"+a;  // 이진수의 길이가 1이고 첫 번째 문자가 아니면 앞에 00을 추가
            
            sb.append(a);  // 변환된 이진수를 StringBuilder에 추가
        }
        
        
        System.out.println(sb);  // 결과 출력
    }
}
