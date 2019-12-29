1000번 문제 a+b출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}

1001번 문제 a-b출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a-b);
    }
}

1008번 문제 a/b출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        System.out.println(a/b);
    }
}
1110번 문제 더하기 사이클
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int plus=0,k=0, j=0, z=0,m=0;
		m=a;
		while(true){
			k = a/10;j = a%10;
			z = (j*10)+(k+j)%10;
			a = z;
			plus++;
			if(a==m) {
				System.out.println(plus);
				break;
			}
		}
	}
}

1330번 문제 < > == 출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else if(a==b){
            System.out.println("==");
        }
    }
}

2438번 문제 별찍기
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

2439번 문제 별찍기2
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i=0; i<a; i++){
                for(int k=a-1; k>i; k--){
                        System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                        System.out.print("*");
                }
                System.out.println();
                }
        }
}



2557번 문제 "Hello World!" 출력
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

2588번 문제 세자리수 x 세자리수 = 1, 10, 100의자리 곱하기 +총합결과 출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=0, j=0, k=0;
        
        i=b%10; j=b%100/10; k=b/100;
        System.out.println(a*i);
        System.out.println(a*j);
        System.out.println(a*k);
        System.out.println(a*b);
    }
}

2739번 문제 구구단 출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int gugu=0;
        sc.close();
        for(int i=1; i<10; i++){
            gugu = a*i;
            System.out.println(a+" * "+i+" = "+gugu);
        }
    }
}

2741번 문제 N찍기
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(i);
        }
    }
}

2742번 문제 N큰숫자부터 찍기
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; a--){
            System.out.println(a);
        }
    }
}

2753번 문제 윤년 평년 구하기
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int k =0;
        if(a%400==0){
            k=1;
        }else if(a%100==0){
            k=0;
        }else if(a%4==0){
            k=1;
        }
        System.out.println(k);
    }
}

2884번 문제 45분 일찍 알람맞추기
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int H=0,M=0;
        H=a;
        M=b-45;
        if(M<0){
            M+=60;
            H--;
            if(H<0){
                H+=24;
            }
        }
        System.out.println(H+" "+M);
    }
}

8393번 문제 1~N까지 합구하기
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=0; i<=a; i++){
            sum+=i;
        }
        sc.close();
        System.out.println(sum);
       
    }
}

9498번 문제 시험성적 출력하기
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        String j = "";
        if(a>=90){
            j="A";
        }else if(a>=80){
            j="B";
        }else if(a>=70){
            j="C";
        }else if(a>=60){
            j="D";
        }else{
            j="F";
        }
        System.out.println(j);
    }
}

10171번 문제 고양이 찍기
public class Main{
    public static void main(String[] args){
        System.out.println("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|\n");
    }
}

10430번 문제 나머지 출력
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println((a+b)%c);
        System.out.println((a%c+b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c*b%c)%c);
    }
}

10718번 문제 "강한친구 대한육군" 2번 출력
public class Main{
    public static void main(String[] args){
        String a = "강한친구 대한육군";
        System.out.println(a);
        System.out.println(a);
    }
}

10817번 문제 2번째로 큰값 출력
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int se=0;
        if(a>b && b>c) {
        	se=b;
        }else if(b>a && a>c) {
        	se=a;
        }else if(a>c && c>b) {
        	se=c;
        }else if(a==b) {
        	se=a;
        }else if(c==b) {
        	se=c;
        }else if(a==c) {
        	se=c;
        }else if(c>b && b>a) {
        	se=b;
        }else if(b>c && c>a ) {
        	se=c;
        }else if(a>b && b<c) {
        	se=a;
        }
        System.out.println(se);
    }
}

------------
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
		if((a<=b && a>=c) || (a<=c && a>=b)) {
			System.out.println(a);
		}
		else if((b<=a && b>=c) || (b<=c && b>=a)) {
			System.out.println(b);
		}
		else if((c<=b && c>=a) || (c<=a && c>=b)) {
			System.out.println(c);
		}
	}
}
10818번 문제 최소값, 최대값 구하기(시간복잡도 개념)
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}
		
		int max=b[0], min=b[b.length-1];
		for(int i=0; i<b.length; i++) {
			if(b[i]>max) {
				max=b[i];
			}
			if(b[i]<min) {
				min=b[i];
			}
		}
		System.out.println(min+" "+max);
	}
}


10869번 문제 사칙연산
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
10871번 문제 X보다 작은 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	try {
    		String a[] = br.readLine().split(" ");
    		int k = Integer.parseInt(a[1]);
    		
    			String b[] = br.readLine().split(" ");
    			
    		for(int i=0; i<Integer.parseInt(a[0]); i++) {
    			if(Integer.parseInt(b[i])<k) {
    				bw.append(String.valueOf(b[i])+" ");
    			}
    		}
    		bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
------------------------
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n;
		int N = sc.nextInt() ,X = sc.nextInt();
		for(i = 0;i<N;i++) {
			n = sc.nextInt();
			if(n < X) {
				System.out.print(n + " ");
			}
		}
	}
}

10950번 문제 a+b
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int k=0; k<i; k++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}

10951번 문제 a+b (숫자말고 다른문자 들어가면 오류처리)
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				int a=sc.nextInt(), b=sc.nextInt();
				System.out.println(a+b);
				
			} catch (Exception e) {
				break;
			}
		}
	}
}

10998번 문제 a*b
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a*b);
    }
}


11021번 문제 Case #N : Sum
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int k = Integer.parseInt(br.readLine());
			for(int i=1; i<=k; i++) {
				String a[] = br.readLine().split(" ");
				int z = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
				System.out.println("Case #"+i+": "+z);
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

11022번 문제 Case #N : A + B = Sum
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int k = Integer.parseInt(br.readLine());
			for(int i=1; i<=k; i++) {
				String a[] = br.readLine().split(" ");
				int z = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
				System.out.println("Case #"+i+": "+a[0]+" + "+a[1]+" = "+z);
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

15552번 문제 빠른 A+B
import java.io.*;
public class Main{
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int sum=0;
    	try {
			int a = Integer.parseInt(br.readLine());
            for(int i=0; i<a; i++){
                String[] b = br.readLine().split(" ");
                sum = Integer.parseInt(b[0]) +Integer.parseInt(b[1]);
                bw.write(sum+"\n");
            }
            bw.flush();
			
		} catch (Exception e) {	
		}
    }
}
