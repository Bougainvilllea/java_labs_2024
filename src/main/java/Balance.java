public class Balance {
    int right_weight = 0;
    int left_weight = 0;
    public void addRight(int right_weight_){
        right_weight = right_weight_;
    }

    public void addLeft(int left_weight_){
        left_weight = left_weight_;
    }

    public void result(){
        if (right_weight == left_weight){
            System.out.println("=");
        } else if (right_weight > left_weight) {
            System.out.println(">");
        }
        else {
            System.out.println("<");}
    }
}
