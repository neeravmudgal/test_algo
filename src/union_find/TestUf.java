package union_find;

import java.util.Random;

import static java.lang.System.*;

public class TestUf {
public static void main(String[] args) {
	int n = 10000000;
	Uf uf = new Uf(n);
	Random r = new Random();
	for(int i = 0 ; i < (n/3)*2;i++){
		int a = r.nextInt(n);
		int b = r.nextInt(n);
		uf.union(a, b==a?(b+1) & n : b);
	}
	//out.println(uf);
	out.println("uf created");
	long st =currentTimeMillis();
	int i = 100000000;
	int c = 0;
	int nc = 0;
	while(i-->0){
		int a = r.nextInt(n);
		int b = r.nextInt(n);
		int d = uf.connected(a, b==a?(b+1) & n : b)?c++:nc++;
	}
	System.out.println("TIME TOOK : " + ( currentTimeMillis() - st));
	out.println("connected " + c);
	out.println("not connected " + nc);
//	out.println(uf.depth_freq);
//	uf.depth_freq.clear();
//	out.println(uf.depth_freq);
}
}
