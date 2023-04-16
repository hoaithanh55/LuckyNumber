
package luckynumber;


import java.util.Scanner;


public class LuckyNumber {
    
    // Tạo biến tổng số lần đoán
    static int totalGuess = 0;
    // Tạo biến tổng số lần chơi
    static int totalGames = 0;
    // Tạo biến để so sánh  tìm số lần đoán ít nhất
    static int bestGame = Integer.MAX_VALUE;

    public static void main(String[] args) {
        play();
        report();
    }
    
    public static void play() {
        
        Scanner sc = new Scanner(System.in);
        // Tạo biến xác nhận Yes/No
        String ans = null;
        do {
            // Tạo biến gán giá trị ngẫu nhiên cần tìm từ 0 đến 100
            int luckyNum =  (int) (Math.random()*101);
            System.out.println("Tôi đang nghĩ một số trong khoảng từ 0 đến 100...");
           
            int guessNum;
            // Tạo biến đếm số lần đoán mỗi lượt chơi
            int a = 0;
            do {
                // Nhập vào số dự đoán
                System.out.print("Bạn đoán ? ");
                guessNum = sc.nextInt();
                // So sánh số đoán với luckyNumber
                if (guessNum < luckyNum) {
                    System.out.println("Số may mắn lớn hơn số dự đoán của bạn.");
                } else if (guessNum > luckyNum) {
                    System.out.println("Số may mắn nhỏ hơn số dự đoán của bạn.");
            }
                a++;
            }
            while (guessNum != luckyNum);
            // Đã đoán đúng con số may mắn
            System.out.println("Chúc mừng bạn đã đoán đúng con số may mắn sau " + a + " lần dự đoán !");
            System.out.print("Bạn có muốn tiếp tục chơi không? ");
            ans = sc.next();
           // if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("khong"));  // chương  trình kết thúc
            totalGames++;
            totalGuess += a;
            // Số lần dự đoán ít nhất //
            if (bestGame >= a){
                bestGame = a;
            }
        } 
            while (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")); // Chương trình tiếp tục
        

        }
            // Xuất kết quả trò chơi
    public static void report() {
            // tính kết quả số lần đoán trung bình mỗi lượt chơi
            double guessAvg = totalGuess/totalGames;
            System.out.println("Kết quả tổng quát của trò chơi : ");
            System.out.println("Tổng số lần chơi : " + totalGames);
            System.out.println("Tổng số lần dự đoán : " + totalGuess);
            System.out.println("Số lần dự đoán trung bình mỗi lượt : " + guessAvg);
            System.out.println("Số lần dự đoán ít nhất : " + bestGame);
    }
}
