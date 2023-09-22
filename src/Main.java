package src;

public class Main {

    public static void main(String[] args) {
            Link L_im1 = new EmptyList().addFirst(3).addFirst(5).addFirst(7);
            Link L_im2 = L_im1.addFirst(4);
            
            System.out.println(L_im1);
            System.out.println(L_im2);
    }
}
