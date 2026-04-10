class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> d = new ArrayDeque<>();
        Arrays.sort(deck);
        for(int i=deck.length-1;i>=0;i--){
            if(!d.isEmpty()){
                int rem = d.removeLast();
                d.addFirst(rem);
            }
            d.addFirst(deck[i]);
        }
        for(int i=0;i<deck.length;i++){
            deck[i] = d.removeFirst();
        }
        return deck;
    }
}