package union_find;

//finds if two dots in fields are connected or not
//it starts with each node being its own root.

public class Uf {

//	public static class MInt{
//		public int i = 0;
//		MInt(){
//			this.i = 1;
//		}
//		void inc(){
//			i++;
//		}
//		@Override
//		public String toString() {
//			return i+"";
//		}
//	}
	private int[] a;
	private int[] sz;
//	public  HashMap<Integer,MInt> depth_freq = 
//			new HashMap<Integer,MInt>(){
//		int top=0;
//		
//		public MInt get(Object key) {
//			MInt mi = super.get(key);
//			mi.inc();
//			MInt topM = super.get(top);
//			if(topM!=null){
//				if(topM.i<mi.i){
//					top=((Integer)(key));
//				}
//			}
//			return mi;
//		};
//		public void clear() {
//			int i = top;
//			MInt mi = super.get(top);
//			super.clear();
//			super.put(i, mi);
//		};
//	};
	public Uf(int n) {
		a = new int[n];
		sz=new int[n];
		for(int i = 0; i < n ; i++){
			a[i] = i;
			sz[i]=1;
		}
	}
	private int root(int i){
		//int depth = 0;
		//if(a[i]==a[a[i]]) return a[i];
		while(a[i]!=a[a[i]]){
			//depth++;
			a[i] = a[a[i]];
			i = a[i];
		}
		//if(depth_freq.containsKey(depth)){
			//depth_freq.get(depth);
		//}else{
			//depth_freq.put(depth,new MInt());
		//}
		return a[i];
	}
	public void union(int i, int j) {
		int ri = root(i);
		int rj = root(j);
		if(ri == rj) return;
		if(sz[ri] < sz[rj]){
			a[ri] = rj;
			sz[rj]+=sz[ri];
			return;
		}
		a[rj] = ri;
		sz[ri]+=sz[rj];
	}
	public boolean connected(int i, int j) {
		return root(i) == root(j);
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int c = 0;
		for(int i  = 0 ; i < a.length; i++){
			sb.append(i+"=" + a[i] + " ").append(c++<=10?"":"\n");
			if(c>11){
				c=0;
			}
		}
		return sb.toString();
	}
}
