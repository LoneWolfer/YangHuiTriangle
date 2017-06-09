public class Main {

    public static void main(String[] args) {
        final int N = 10;    //阶数
        int[][] a = new int[N][];
        for (int i = 0; i < a.length; i++){
            a[i] = new int[i+1];               //第i行有i+1列
            a[i][0] = 1;                     //每一列第一行为1
            a[i][a[i].length-1] = 1;          //每一列最后一行为1
        }
        for (int i = 2; i < a.length; i++){             //第三行开始为元素赋值
            //从第二列开始为元素赋值
            for (int j = 1; j < a[i].length-1; j++){
                a[i][j] = a[i-1][j] + a[i-1][j-1];
            }
        }
        for (int i = 0; i < a.length; i++){        //打印N行
            for (int j = 0; j < a[i].length; j++){           //打印第i行
                System.out.printf("%-4d", a[i][j]);           //打印元素
            }
            System.out.println();    //每打印一行换行
        }
    }
}
