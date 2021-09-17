public class Main 
{
   public static void main(String[] args) 
   {
       int[][] matrix = 
       {
               {8, 1, 6},
               {3, 5, 7},
               {4, 9, 0},
       };

       for(int arrRow=0; arrRow<=matrix.length-1; arrRow++)
       {
           for(int arrPosition=0; arrPosition<=matrix[arrRow].length-1; arrPosition++)
           {
               System.out.println(matrix[arrRow][arrPosition]);
           }
       }
    }
  }

//sololearn.com 24.2 Practice: Matrix