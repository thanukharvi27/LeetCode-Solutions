class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPopulation=0;
        int answer=1950;
        for(int year=1950;year<=2050;year++){
            int count=0;
            for(int[] person:logs){
               int birth=person[0];
               int death=person[1];

               if(year>=birth && year<death){
                    count++;
               }
                           
            }

            if(count>maxPopulation){
                maxPopulation=count;
                answer=year;

            }
        }

        return answer;
    }
}