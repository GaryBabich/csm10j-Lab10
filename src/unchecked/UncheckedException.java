package unchecked;

public class UncheckedException {
    
    public static void ThrowIndexOutOfBounds() {
        
        int[] numbers = new int[10];
        
        System.out.println(numbers[10]);
        
    }
    
    public static void CatchIndexOutOfBounds(){
        
        try{
            int[] numbers = new int[10];
            numbers[10] = 12;
            System.out.println(numbers.length-1);
        
        }catch (ArrayIndexOutOfBoundsException aex){
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
    } 
    public static void CatchIndexOutOfBoundsFinally(){
        
        try{
            int[] numbers = new int[10];
            numbers[10] = 12;
            System.out.println(numbers.length-1);
        
        }catch (ArrayIndexOutOfBoundsException aex){
            System.out.println("Caught ArrayIndexOutOfBounds");
        
        } finally{
            System.out.println("Finally statement executed");
        }
    }
}
