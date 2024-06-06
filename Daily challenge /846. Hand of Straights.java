class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }
        int[] handCopy = new int[hand.length];
        System.arraycopy(hand, 0, handCopy, 0, handCopy.length);
        Arrays.sort(handCopy);
        for(int i = 0; i < handCopy.length; i++) {
            if(handCopy[i] == -1) {
                continue;
            }
            int last = handCopy[i];
            int count = 1;
            for(int j=i+1;j<handCopy.length && count<groupSize;j++){
                if(handCopy[j]==last || handCopy[j]==-1){
                    continue;
                }
                if(handCopy[j]-last==1){
                    last=handCopy[j];
                    handCopy[j]=-1;
                    count++;
                } else {
                    break;
                }
            }
            if(count!= groupSize) {
                return false;
            }
        }
        return true; 
    }
}
