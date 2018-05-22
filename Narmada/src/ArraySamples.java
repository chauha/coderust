public  class ArraySamples {

public static  void mergeArray(int [] arr1, int [] arr2){
     for (int cnt=0; cnt< arr2.length ; cnt ++){
         if (arr1[cnt] < arr2[cnt]){
             System.out.print(arr1[cnt] + "\t");
         }
    }


}


public static int findKMissing(int [] arr1 , int [] arr2,  int num) {
int count = 0;

for (int j = 0; j < arr2.length - 1; j++) {
findAndMark(arr1[j], arr1);
}
for (int k = 0; k < arr2.length - 1; k++) {

if (arr2[k] >= 0) {
count++;
}
if (count == num) {
return arr2[k];
}


}
return 0;
}

public static void findAndMark(int num,int [] arr1){

        int pos = find(arr1, num);

        if (pos == -1) {
            return;
        }

        arr1[pos] = -1 * arr1[pos];
}

public static int find(int[] array, int target) {
    int l = 0;
    int u = array.length - 1;

    int p = -1;
    while (true) {
        if (l > u) {
            return -1;
        }

        int m = (l + u) / 2;

        if (array[m] == target) {
             return m;
        } else if (array[m] > target) {
            u = m - 1;
        } else {
            l = m + 1;
        }
    }
}

public static void reArrangeArray(int [] array1){
    int i=-1, temp=0;
    for ( int j=0; j<array1.length; j++){
         if (array1[j]<0){
            i++;
            temp=array1[i];
            array1[i]=array1[j];
            array1[j]=temp;

        }

    }

    System.out.println(array1[i]);
//        int neg=0 ;
//        while ( i < array1.length && neg<i ){
//
//
//        }


}

public static void main(String []args ){
int [] arr1 = {2,4,1,6};
int [] arr2 = {5,8,3};
//mergeArray(arr1,arr2);
int [] array1= {-1,2,3,-4,-5};
reArrangeArray(array1);
for (int count=0;count< array1.length;count++){
    System.out.println(array1[count]);

}
}


}
