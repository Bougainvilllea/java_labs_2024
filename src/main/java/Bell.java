public class Bell {
    boolean flag = false;
    public void sound(){

        if (flag) {
            System.out.println("dong");
            flag = false;
        }
        else  {
            System.out.println("ding");
            flag = true;
            }
    }
}
