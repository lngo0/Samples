public class TowerOfHanoi {
    //Recursive Method for Solving the Tower of hanoi.
    /*
                                                                                                                                    n = 3
                                              --------------------------------------------------------------------3 disks src= A, aux = B, des = C-------------------------------------------------------------------
                                      (n - 1) |                                                                                    1  |                                                                             | (n - 1)
                                              |                                                                                       |                                                                             |
                    --------------------2 disks src = A, aux = C, des = B---------------------                          1 disk, src = A, aux = B, des = C                    --------------------2 disks src = A, aux = C, des = B---------------------
          (n - 1)  |                                       1 |                               |  (n - 1)                          src -> dest                         (n - 1)  |                                       1 |                               |  (n - 1)
                   |                                         |                               |                                     A  ->  C                                   |                                         |                               |
   1 disk src = A, aux = B, des = C          1 disk src = A, aux = C, des = B     1 disk src = C, aux = A, des = B                                               1 disk src = B, aux = C, des = A          1 disk src = B, aux = A, des = C     1 disk src = A, aux = B, des = C
            src ->  dest                            src -> dest                         src -> dest                                                                      src -> dest                                 src -> dest                    src -> dest
            A   ->  C                               A   ->  B                           B   ->  C                                                                        B  ->  A                                     B  ->  C                       A  ->  C
     */
    private static void TOH(char source, char auxiliary, char destination, int numOfDisk){
        if (numOfDisk > 0) {
            //
            TOH(source, destination, auxiliary, numOfDisk - 1);
            System.out.println("Move 1 disk from " + source + " to " + destination +" using " + auxiliary + ".");
            TOH(auxiliary, source, destination, numOfDisk - 1);
        }
    }
    public static void main(String[] args) {
        TOH('A','B','C', 3);
    }
}
