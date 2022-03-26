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
1003번 문제 피보나치 함수
import java.io.*;

public class Main {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int k[] = new int[x];

            for(int i=0; i<x; i++){
                 k[i] = Integer.parseInt(br.readLine());
            }
            for(int value : k){
                if(value==0){
                    System.out.println("1 0");
                }else if (value==1){
                    System.out.println("0 1");
                }else{
			// 2부터 시작하게끔
                    fibo(2,value,1,1,2);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int fibo(int zero,int value,int b, int c,int d){
        zero++;
        if(zero==value+1){
            System.out.println(b+" "+c);
        }else{
            return fibo(zero,value,c,d,c+d);
        }
        return 0;
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

1011번 문제 Fly me to the Alpha Centauri 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 1         =1       1 =  1
* 11        =2       1 =  2
* 111       =3       1 =  3
* 121       =4       2 =  3
* 1211      =5       2 =  4
* 1221      =6       2 =  4
* 12211     =7       2 =  5
* 12221     =8       2 =  5
* 12321     =9       3 =  5
* 123211    =10      3 =  6
* 123221    =11      3 =  6
* 123321    =12      3 =  6
* 1233211   =13      3 =  7
* 1233221   =14      3 =  7
* 1233321   =15      3 =  7
* 1234321   =16      4 =  7
* 12343211  =17      4 =  8
* 거리의 제곱근
* */
public class FlyToTheCentauri {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        while(x>0){
            StringTokenizer sz = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(sz.nextToken());
            int b = Integer.parseInt(sz.nextToken());
            int c = b-a;
            int k = (int)Math.sqrt(c);

            if(k == Math.sqrt(c)){
                System.out.println(k*2 -1);
            }else if(c<= k*k+k){
                System.out.println(k*2);
            }else{
                System.out.println(k*2+1);
            }
            x--;
        }

    }
}

1065번 문제 한수
/*뭐 이딴 문제가 다있어*/

import java.util.*;

public class OneNumber01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<100){
            System.out.println(num);
        }
        else{
            int result = 99;

            for (int i = 111; i <= num; i++)
                result += han(i);
            System.out.println(result);
        }
    }

    private static int han (int inum) {
        int hun = inum / 100;
        int ten = inum % 100 / 10;
        int one = inum % 10;

        if (ten*2 == hun + one) {
            return 1;
        }

        return 0;
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

1152번 문제 단어 갯수 세기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.println(st.countTokens());
	}
}
-----------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(new StringTokenizer(br.readLine()," ").countTokens());
	}
}


1157번 문제 단어공부(제일 많이나온 단어 대문자로 출력 같으면 '?' 출력)
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toLowerCase();
		int max=0, min=0, check=0;
		int every[] = new int[26];
		for(int k=0; k<26; k++) {
			every[k]=0;
		}
		for(int i=0;i<word.length(); i++) {
			int a = word.charAt(i)-'a';
			every[a] += 1;
			if(every[a]>max) {
				max=every[a];
				check=a;
			}else if(max==every[a]) {
				min=max;
			}
		}
		System.out.println(max==min ? "?" : (char)(check+'A'));
	}
}

1193번 문제 분수찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ZigZag {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int sum = 0; int count = 1;
        while(true){
            if(x <= sum+count){
                if(count%2==1){
                    System.out.println((count-(x-sum-1))+"/"+(x-sum));
                    break;
                }else{
                    System.out.println((x-sum)+"/"+(count-(x-sum-1)));
                    break;
                }
            }else{
                sum += count;
                count++;
            }
        }

    }
}


1316번 문제 그룹 단어 체커
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int k = Integer.parseInt(br.readLine());
			int ea=0;
			
			int alphabet[] = new int[26];
			for(int i=0; i<alphabet.length; i++) {
				alphabet[i]=99;
			}
			
			for(int i=0; i<k; i++) {
				String word = br.readLine().toLowerCase();
				int w =0;
				boolean TF = true;
				for(int j=0; j<word.length(); j++) {
					w = word.charAt(j)-'a';
					if(alphabet[w]==99) {
						alphabet[w] = w;
					}else if(alphabet[w]==alphabet[(int)word.charAt(j-1)-'a']){
						
					}else {
						TF=false;
						break;
					}
				}
				for(int z=0; z<alphabet.length; z++) {
					alphabet[z]=99;
				}
				if(TF) {
					ea++;
				}
			}
			System.out.println(ea);
		} catch (IOException e) {
		}
	}
}
----------------------------------------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(br.readLine());
			int count=0;
			
			W : for(int i=0; i<a; i++) {
				String b = br.readLine();
				
				for(int j=0; j<b.length()-1; j++) {
					char c =b.charAt(j);
					int d = b.indexOf(c,j+1);
					
					if(d!=j+1) {
						if(d!=-1) {
							continue W;
						}
					}
				}
				count++;
			}
			System.out.println(count);
		} catch (IOException e) {
		}
	}
}
-----------------------------------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int ea=0;
			int k = Integer.parseInt(br.readLine());
			for(int i=0; i<k; i++) {
				Boolean TF=true;
				String b = br.readLine();
				int max=0;
				for(int j=0; j<b.length(); j++) {
					char c = b.charAt(j);
					if(b.indexOf(c)>=max) {
						max = b.indexOf(c);						
					}else {
						TF=false;
						break;
					}
				}
				if(TF) {
					ea++;
				}
			}
			System.out.println(ea);
		} catch (IOException e) {
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

1546번 문제 평균 구하기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int k[]=new int[a];
    	double max=0;
    	double av=0;
    	double jumsu[] = new double[a];
        
    	for(int i=0; i<a; i++) {
    		k[i] = sc.nextInt();
    		if(k[i]>max) {
    			max=k[i];
    		}
    	}
    	
    	for(int i=0; i<a; i++) {
    		jumsu[i] = (k[i]/max)*100;
    		av += jumsu[i];
    	}
    	System.out.println(String.format("%.2f", av/a));
    }
}

1712번 문제 손익분기점

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String a[] = br.readLine().split(" ");
			int k1 = Integer.parseInt(a[0]);
			int k2 = Integer.parseInt(a[1]);
			int k3 = Integer.parseInt(a[2]);
			int ea=0;
			int money = k3-k2;
			if(money>0) {
				ea = k1/money+1;
			}else {
				ea= -1;
			}
			if(ea==0) {
				ea=1;
			}
			System.out.println(ea);
		} catch (IOException e) {
		}
	}
}

1929번 문제 소수 찾기
/*에라토스테네스의 체 알고리즘을 활용해야지 시간초과가 안뜬다..*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class SoSu1929 {
    public static boolean[] prime;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        prime = new boolean[y + 1];
        get_prime();

        StringBuilder sb = new StringBuilder();
        for(int i = x; i <= y; i++) {
            // false = 소수
            if(!prime[i]) sb.append(i).append('\n');
        }
            System.out.println(sb);
        }catch (Exception e){

        }
    }

    // 에라토스테네스의 체 알고리즘
    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}


1978번 문제 소수 찾기
/*
숫자 입력하는데
처음은 몇개입력할지
두번째는 숫자 1열로 띄어쓰기로 나열
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoSuFind1978 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer sz = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            if(k == sz.countTokens()){
                while(sz.hasMoreTokens()){
                    int x = Integer.parseInt(sz.nextToken());
                    boolean tr = false;
                    for(int i=1; i<x; i++){
                        if(x%i == 0){
                           if(i==1 || i==x){
                               tr = true;
                           }else{
                               tr = false;
                               break;
                           }
                        }
                    }
                    if(tr){
                        sum++;
                    }
                }
                System.out.println(sum);
            }else{
                System.out.println("입력 제대로하렴");
            }

        }catch (Exception e){

        }
    }
}


2292번 문제 벌집
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt()-1;
        int q = k;
        int i = 0;
        while(k>0){
            if(i!=0){
                k -= i*6;
            }
            i++;
        }
        if(q==0){
            System.out.println(1);
        }else{
            System.out.println(i);
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


2581번 문제 소수 소수의 합계 + 최소값 + 없으면 -1 출력
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SoSu2581 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            int sum = 0;
            int cnt = 0;
            int check = 0;
            int min = 0;
            while(x<=y) {
                boolean tr = false;
                for(int i=1; i<x; i++){
                    if(x%i == 0){
                        if(i==1 || i==x){
                            tr = true;
                            check = x;
                        }else{
                            tr = false;
                            break;
                        }
                    }
                }
                if(tr){
                    cnt++;
                    sum += check;
                    if(min == 0){
                        min = check;
                    }
                }
                x++;
            }
            if(sum>0){
                System.out.println(sum);
                System.out.println(min);
            }else{
                System.out.println(-1);
            }

        }catch (Exception e){

        }
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
2562번 문제 9개의 숫자 최대값, 자리 구하기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a[] =new int[9];
    	for(int i=0;i<9;i++) {
    		a[i] = sc.nextInt();
    	}
    	int max=a[0];
    	int temp=1;
    	for(int i=0; i<9; i++) {
    		if(a[i]>max) {
    			max=a[i];
    			temp=i+1;
    		}
    	}
    	System.out.println(max+"\n"+temp);
    	
    }
}
2577번 문제 숫자의 개수 세기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int sum = a*b*c;    	
    	int count[] = new int[10];
    	
    	while(sum>0) {
    		count[sum%10]++;
    		sum /= 10;
    	}
    	for(int i=0; i<10; i++) {
    		System.out.println(count[i]);
    	}
    }
}
--------------------------------------------------
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt()*sc.nextInt()*sc.nextInt();
		int [] count = new int [10];
		String number = String.valueOf(result);
		
		for(int i = 0; i < number.length(); i++) count[number.charAt(i)-'0']++;
		for(int i : count) System.out.println(i);
		sc.close();
	}
}

2675번 문제 문자열 반복
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int aa = Integer.parseInt(br.readLine());
			for(int i=0; i<aa; i++) {
				String b[] = br.readLine().split(" ");
				for(int z=0; z<b[1].length(); z++) {
					for(int qq=0; qq<Integer.parseInt(b[0]); qq++) {
						System.out.print(b[1].charAt(z));
						}
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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

2775번 문제 부녀회장이 될테야
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* 1부터 n까지 더함.
* 각 층별로 해줌 (15층)
* */
public class PowerCEO {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int k = Integer.parseInt(br.readLine());
            for(int x=0; x<k; x++){
                int q = Integer.parseInt(br.readLine());
                int w = Integer.parseInt(br.readLine());
                int APT[][] = new int[15][15];
                for(int i=0; i<15; i++){
                    APT[i][1]=1;
                    APT[0][i]=i;
                }
                for(int j=1; j<15; j++){
                    for(int e=2; e<15; e++){
                        APT[j][e] = APT[j][e-1] + APT[j-1][e];
                    }
                }
                System.out.println(APT[q][w]);
            }
        }catch (Exception e){

        }
    }
}

2839번 문제 설탕배달
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SugarMan {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int sugar = Integer.parseInt(br.readLine());
            if(sugar==7 || (sugar<5 && sugar!=3)){
                System.out.println(-1);
            }else if(sugar%5==0){
                System.out.println(sugar/5);
            }else if(sugar%5==1 || sugar%5==3){
                System.out.println((sugar/5)+1);
            }else if(sugar%5==2 || sugar%5==4){
                System.out.println((sugar/5)+2);
            }
        }catch (Exception e){
            System.out.println("Go To Hell");
        }

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

2908번 문제 숫자 뒤집어서 비교하기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int count = st.countTokens();
		String k[] = new String[count];
		String reverse = "";
		int max=0;
		for(int i=0; st.hasMoreTokens(); i++) {
			k[i] = st.nextToken();
			for(int j=count; j>=0; j--) {
				reverse += k[i].charAt(j)-'0';
			}
			if(Integer.parseInt(reverse) > max) {
				max = Integer.parseInt(reverse);				
			}
			reverse="";
		}
		System.out.println(max);
	}
}

2920번 문제 음계(주어진 배열이 오름차순인지 아닌지 판단)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String dd = "";
    	int a[] = new int[8];
    	int k = 8, j=1,z=1;
    	for(int i=0; i<8; i++) {
    		a[i] = sc.nextInt();
    		if(a[i] == i+1) {
    			dd = "ascending";
    			j++;
    			if(j<z) {
    				dd = "mixed";
    				break;
    			}
    		}else if(a[i]==k) {
    			dd = "descending";
    			z++;
    			if(z<j) {
    				dd="mixed";
    				break;
    			}
    		}else {
    			dd="mixed";
    			break;
    		}
    		k--;
    	}
    	System.out.println(dd);
    }
}

2941번 문제 크로아티아 알파벳
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String croa[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
			String word = br.readLine();
			for(int i=0; i<croa.length; i++) {
				word = word.replaceAll(croa[i],"a");
			}
			System.out.println(word.length());
		} catch (IOException e) {
		}
	}
}
---------------------------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String s = new Scanner(System.in).next();
        s = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "a");
        System.out.println(s.length());
    }
}

3052번 문제 중복값 출력하기
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int tt[] = new int[10];
		int k[] = new int[42];
		int count=0;
		for(int i=0; i<k.length; i++) {
			k[i] = 0;
		}
		for(int i=0; i<10; i++) {
			a[i] = sc.nextInt();
			tt[i] = a[i]%42;//42의 나머지값을 넣어줌.
			k[tt[i]] = 999;
			
		}
		for(int i=0; i<k.length; i++) {
			if(k[i]==999) {
				count++;
			}
			System.out.println(k[i]);
		}
		
		System.out.println(count);
	}
}

-------------------------------------
import java.util.*; //HashSet(중복불가) 사용 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i =0; i< 10; i++)
    		set.add(sc.nextInt()%42);
    	System.out.println(set.size());
	}
}

4344번 문제 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
    	String per = "0.000%";
    	DecimalFormat df = new DecimalFormat(per);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	try {
    		int a = Integer.parseInt(br.readLine());
    		
    		for(int i=0; i<a; i++) {
    			String k[] = br.readLine().split(" ");
    			double kk = Integer.parseInt(k[0]);
    			double average=0, total=0, av = 0 ,count=0;
    			int sum[] = new int[(int) kk];
    			
    			for(int j=0; j<kk; j++) {
    				sum[j] = Integer.parseInt(k[j+1]);
    				total += sum[j];
    			}
    			average = total/kk;
    			for(int j=0; j<kk; j++) {
    				if(average<sum[j]) {
    					count++;
    				}
    			}
    			av = count/kk;
    			System.out.println(df.format(av));
    		}
    		bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

4673번 문제 셀프넘버
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int n;
        int d;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i <= 10000; i++) {
            n = i;
            d = n;
            while (n > 0) {
                d += n % 10;
                n /= 10;
            }
            hm.put(d,1);
            if(hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i,0);
            }
        }
        for(Integer k : hm.keySet()){
            if(hm.get(k).equals(0)){
                System.out.println(k);
            }
        }
    }
}

/*
* 베르트랑 공준
* 4948번 문제
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class practice001 {
    public static boolean[] prime;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<Integer> k = new ArrayList<>();

            while(true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) {
                    break;
                } else {
                    k.add(x);
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int s=0; s<k.size(); s++){
                int num = k.get(s);
                int z = 0;
                prime = new boolean[(num * 2)+1];
                get_prime();

                for (int i = num+1; i <= num * 2; i++) {
                    // false = 소수
                    if (!prime[i]) z++;
                }
                sb.append(z).append('\n');
            }
            System.out.println(sb.delete(sb.length()-1,sb.length()));
        }catch (Exception e){

        }
    }
	
    // 에라토스테네스의 체 알고리즘
    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;
        for(int i = 0; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}



5622번 문제 다이얼전화기 시간구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sum=0;
			int b[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
			String call = br.readLine().toUpperCase();
			for(int i=0; i<call.length(); i++) {
				int k = call.charAt(i)-'A';
				sum += b[k];
			}
			System.out.println(sum);
		} catch (IOException e) {
		}
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

8958번 문제 OX 퀴즈
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	try {
			int a = Integer.parseInt(br.readLine());
			String k[] = new String[a];
			for(int i=0; i<a; i++) {
				k[i] = br.readLine();
				int sum=0;
		    		int count=0;
				for(int j=0; j<k[i].length(); j++) {
					if(k[i].charAt(j)=='O') {
						count++;
						sum+=count;
					}else {
						count=0;
					}
				}
				System.out.println(sum);
			}
			bw.flush();
		} catch (Exception e) {
		}
    }
}

/*
 * 9020번 문제
 * 골드바흐의 추측
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class practice001 {
    public static boolean[] prime;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<Integer> k = new ArrayList<>();
            int count = Integer.parseInt(br.readLine());
            while(count>0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                k.add(x);
                count--;
            }
            for(int s=0; s<k.size(); s++){
                int num = k.get(s);
                prime = new boolean[num+1];
                get_prime();
                List<Integer> listA = new ArrayList<>();
                for (int i = 0; i <= num; i++) {
                    // false = 소수
                    if (!prime[i]) {
                        listA.add(i);
                    }
                }
                int aa=0;
                int bb=0;
                int max=0;
                int min=0;
                for(int ls=0; ls<listA.size(); ls++){
                    aa = listA.get(ls);
                    if(max==min && max!=0){
                        break;
                    }
                    for(int lx=ls; lx<listA.size(); lx++){
                        bb = listA.get(lx);
                        if(aa+bb ==num) {
                            if(aa==bb){
                                max = aa;
                                min = bb;
                                break;
                            }
                            if(bb-aa<0){
                                break;
                            }
                            max = aa;
                            min = bb;
                        }
                    }
                }
                System.out.println(max+" "+min);
            }
        }catch (Exception e){

        }
    }

    // 에라토스테네스의 체 알고리즘
    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;
        for(int i = 0; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
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

10250번 문제 ACM호텔

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int k = Integer.parseInt(br.readLine());
            while(k>0){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int h = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                int x = n%h;
                int y = n/h+1;
                if(x==0){
                    x=h;
                    y -=1;
                }

                if(y>9){
                    System.out.println(x +""+ y);
                }else{
                    System.out.println(x +"0"+ y);
                }
                k--;
            }

        } catch (IOException e) {

        }
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

10757번 문제 큰수A+B
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNumber {
    public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                StringTokenizer sz = new StringTokenizer(br.readLine()," ");
                BigInteger a = new BigInteger(sz.nextToken());
                BigInteger b = new BigInteger(sz.nextToken());
                a = a.add(b);
                System.out.println(a.toString());
            }catch (Exception e){

            }
    }
}

10809번 문제 문자열이 몇번째에 처음 등장했는지 알아내시오
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sum=0;
			String aa = br.readLine();
			int kk[] = new int[26];
			for(int i=0; i<26; i++) {
				kk[i]= -1;
			}
			
			for(int i=0; i<aa.length(); i++) {
				sum = (int)aa.charAt(i)-'a';
				if(kk[sum]==-1) {
					kk[sum] = i;					
				}
			}
			int s=1;
			for(int k : kk) {
				if(s==1) {
					System.out.print(k);
					s++;
				}else {
					System.out.print(" "+k);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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
11653번 문제 소인수분해
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SoinSuDivide {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            int k = Integer.parseInt(br.readLine());

            while(k>0){
                for(int i=2; i<=k; i++){
                    if(k%i == 0){
                        k = k/i;
                        System.out.println(i+", "+k);
                        break;
                    }
                }
                if(k==1){
                    break;
                }
            }

        }catch (Exception e){

        }
    }
}


11654번 문제 아스키코드 변환
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
    	System.out.println((int)(a.charAt(0)));
	}
}

11720번 문제 숫자의 합(여러숫자를 한번에줘도 하나씩만 더하기)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(br.readLine());
			int sum=0;
			String aa = br.readLine();
			for(int i=0; i<a; i++) {
				sum += (int)aa.charAt(i)-'0';
			}
			System.out.println(sum);
		} catch (IOException e) {
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

15596번 문제 정수 n개의 합

public class Test {
    long sum(int a[]) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
        	ans += a[i];
        }
        return ans;
    }
}

