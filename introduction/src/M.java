public class M {
    public static void main(String[] args) {
        String s[][] = {{"a", "b", "c"},
                {"d", "e", "f"}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0){
                    System.out.print(s[i][j] + "\t");
                } else {
                    System.out.print(s[i][j].toUpperCase() + "\t");
                }
            }
            System.out.println();
        }
    }
}
