import java.util.ArrayList;

public class Table {
    private Integer rows;
    private Integer cols;
    ArrayList<ArrayList<Integer>> list_table = new ArrayList<>();

    public Table(int row, int col) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            tmp.add(0);
        }
        for (int i = 0; i < col; i++) {
            ArrayList<Integer> tmp_copy = new ArrayList<>(tmp);
            list_table.add(tmp_copy);
        }

        rows = row;
        cols = col;


    }

    public Integer getValue(int row, int col) {
        return list_table.get(row).get(col);
    }

    public void setValue(int row, int col, int value) {
        list_table.get(row).set(col, value);
    }

    public Integer rows() {
        return rows;
    }

    public Integer cols() {
        return cols;
    }

    public String toString() {
        String string_table = "";
        for (int i = 0; i < cols; i++) {
            string_table += "\n";
            for (int j = 0; j < rows; j++) {
                string_table += list_table.get(i).get(j) + "; ";
            }
        }
        return string_table;
    }

    public Integer average() {
        Integer sum_table = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                sum_table += list_table.get(i).get(j);
            }
        }
        return sum_table / (cols * rows);

    }

}