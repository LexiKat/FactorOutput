 //   _   _   _   _   _   _   _   _   _   _   _   _
 //  / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ / \
 // ( F | a | c | t | o | r | O | u | t | p | u | t )
 //  \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/

class FactorOutput{
   public static void main(String[] args) {
     int N = Integer.parseInt(args[0]); //selected number
     int[] Array = new int[N];  //creates an array from 0-N for sample size
     for(int i = 0; i < Array.length; i++)
       Array[i] = i;
     int[] Factor = new int[N]; //creates an array from 0-N to multiply each array number by
     for(int i = 0; i < Factor.length; i++){
       Factor[i] = i;
     }
     System.out.println(1+"x"+N);

for(int i = 0; i < N/25; i++){ //checks every index i * index p to see if its a factor of N
  for(int p = 0; p < N; p++){
    if(Array[i] * Factor[p] == N){
      System.out.println(Array[i]+"x"+Factor[p]);
          }
       }
     }
  }
}
