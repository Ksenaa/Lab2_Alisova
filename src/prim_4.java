public class prim_4 {
    public static void main(String[] args) {
        try
        {
            System.out.println("0");
            throw new RuntimeException("помилка");
        }catch (NullPointerException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }
}


