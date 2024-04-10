class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            queue.add(i);
        }
        int[] res=new int[deck.length];
        for(int card:deck){
            int idx=queue.poll();
            res[idx]=card;
            if(!queue.isEmpty()){
                queue.add(queue.poll());
            }
        }
        return res;
    }
}
