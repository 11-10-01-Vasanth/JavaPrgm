package proj;

public class BSorting {

    public static void main(String[] args) {
    	int a[] = { 4,7,2,1,9,3,5 };
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(key<a[j] && j>=0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
