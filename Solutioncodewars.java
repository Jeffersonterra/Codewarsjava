public class Solutioncodewars {
  public static int century(int number) {
 
        int rest = number % 100;
        int centu = (number - rest);
        int result = number / 100;
        if (rest != 0) {
            result += 1;

        }
    
    return (result);
  }
}
