public class find_nooin2d {
    public static void main(String[] args) {

        int a= 5;
        int [][] arr= {
                {3,5,7},
                {4,6,7},
                {9,4,5}

        };
        findnoin2d(a,arr);
    }
    static void findnoin2d(int a, int [][] arr){
        for(int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length ; j++){
                int check= arr[i][j];
                if( check == a){
                    System.out.println("row= " + (i+1) + "column =" + (j+1) );
                }
            }
        }
    }

}


