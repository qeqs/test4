package test;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        for (String s:transferFromAtoC(3)
             ) {
            System.out.println(s);
        }

    }
    public static List<String> transferFromAtoC(int n) {
        /*
          Towers Of Hanoi.
          There are three pegs: A, B and C. There are n disks. All disks are different in size.
          The disks are initially stacked on peg A so that they increase in size from the top to the bottom.
          The goal is to transfer the entire tower from the A peg to the C peg.
          One disk at a time can be moved from the top of a stack either to an empty peg or to
          a peg with a larger disk than itself on the top of its stack.

          The method should return a sequence of disk moves, each move is a String with two letters (A, B or C)
          corresponding to the peg the disk moves from and the peg it moves to.
          For example, the move "AC" means that a top disk from peg A should be moved to peg C.
         */
        List<String> res = new ArrayList<String>();
        move(n,"A","B","C",res);

        return res;
    }
    public static void move(int num,String a,String b,String c, List<String> res){

        if(num>0){

            move(num-1,a,c,b,res);

            res.add(a+c);

            move(num-1,b,a,c,res);

        }

    }
}
