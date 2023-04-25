/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

 import edu.princeton.cs.algs4.StdIn;
 import edu.princeton.cs.algs4.StdOut;
 import edu.princeton.cs.algs4.StdRandom;
 
 public class RandomWord {
     public static void main(String[] args) {
         String champion = null;
         int count = 1;
         while (!StdIn.isEmpty()){
             String string = StdIn.readString();
             boolean str = StdRandom.bernoulli((double) 1 / count);
 
             if (str) {
                 champion = string;
             }
             count++;
         }
         StdOut.println(champion);
     }
 
 }