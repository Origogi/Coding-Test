package programmers.stack_queue;

import java.util.Stack;

public class Test1 {

    public static void main(String[] args) {

        new Test1().solution(new int[]{1, 2, 3, 2, 3});
    }

    class Stock {
        int price;
        int index;

        public Stock(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Stock> stack = new Stack<>();

        stack.push(new Stock(prices[0], 0));

        for (int i = 1;i<prices.length;i++) {
            if (stack.peek().price <= prices[i]) {
                stack.push(new Stock(prices[i], i));
                continue;
            }

            while (!stack.isEmpty() && stack.peek().price > prices[i]) {
                Stock stock = stack.pop();
                answer[stock.index] = i - stock.index;
            }
            stack.push(new Stock(prices[i], i));
        }

        while (!stack.isEmpty()) {
            Stock stock = stack.pop();
            answer[stock.index] = prices.length -1 - stock.index;
        }

        return answer;
    }




}
