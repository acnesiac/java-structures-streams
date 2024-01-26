public class CognizantAlgorithmHashMap {
    public static void main(String[] args) {

        //https://discuss.codechef.com/t/backtracking-the-power-sum-hackerranks-problem-recursion/17667/2
//        Recursive Solution: sum(X, N, 1) gives the answer.
//
//        static int sum(int X, int N, int num){
//
//            int value = X - (int)Math.pow(num, N);
//
//            if(value < 0)return 0;
//
//            if(value == 0)return 1;
//
//            return sum(X, N, num+1) + sum(value,N,num+1);

//        }

//        import java.util.HashMap;
//        class Main {
//
//            // Q:  Given a string, find the length of the longest substring without repeating characters.
//            // Examples: "abcabcbb" -->  abc, bca, cab A: 3
//            // "qqwerthhhhh" --> qwerth A: 6
//            public static void main(String[] args) {
//                System.out.println("hello, world");
//                int max = 0;
//
//                HashMap<String, Integer> hm = new  HashMap<String, Integer>();
//                char[] str = "abcabcbb".toCharArray();
//                for (int i = 0 ; i< str.length ; i++) {
//                    int current = 0;
//                    if ( hm.get( str [i]) != null ){
//                        hm.put( str [i] + "", 1 );
//                    }
//                    else{
//                        current ++;
//                        if ( current > max) max = current;
//                        hm.put( str[i] + "", hm.get(str[i])  + 1 );
//                    }
//
//                    System.out.println(hm);
//
//                }
//
//            }
//        }

    }

//
//    let arrList = [1, 2,[3,4],5,[6,[7,8],9,10],11,12]
//    /* Expected output = [1,2,3,4,5,6,7,8,9,10,11,12] */
//    var arrRes = [];
//    var Module = new function (){
//        return function recursive ( element,  arr){
//            console.log('res' + arr);
//            if ( element.length == 0 ){
//                return arr;
//            }
//            else {
//                recursive ( arr[arr.lentgh -1], arr );
//            }
//        }
//    };
//    Module(arrList[arrList.length-1],arrList);
//

}
