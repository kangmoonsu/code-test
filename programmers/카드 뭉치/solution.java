// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/159994

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    
        int card1 = 0;
        int card2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if(card1 < cards1.length && goal[i].equals(cards1[card1])) {
                card1++;
                continue;
            }

            if(card2 < cards2.length && goal[i].equals(cards2[card2])) {
                card2++;
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}